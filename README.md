# JavaInteger
Java Integer违反了Java普通Object指针的原则。修改Integer的值将使得变量指向另外一个Object。
Java Integer Cache:
http://javapapers.com/java/java-integer-cache/

This caching behavior is not only applicable for Integer objects. We have similar caching implementation for all the integer type classes.
We have ByteCache doing the caching for Byte objects.
We have ShortCache doing the caching for Short objects.
We have LongCache doing the caching for Long objects.
We have CharacterCache doing the caching for Character objects.
Byte, Short, Long has fixed range for caching, i.e. values between –127 to 127 (inclusive). For Character, the range is from 0 to 127 (inclusive). Range cannot be modified via argument but for Integer, it can be done.
