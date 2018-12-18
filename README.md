# String Calculator TDD Kata Variant

This is a variant of the TDD Kata by Roy Osherove ([original exercise description](http://osherove.com/tdd-kata-1/)), implemented in Java.

## Before you start

* Try not to read ahead.
* Do one task at a time. the trick is to learn to work incrementally.
* Make sure you only test for correct inputs. There is no need to test for invalid inputs for this kata.

## Kata

1. Create a simple String calculator that takes a string containing an unknown amount of numbers separated by commas (`,`) or new lines (`\n`), and returns their sum.
   * For an empty string the calculator should return 0.
   * The following inputs are **ok** `1`, `"1,2"`, `"3\n4\n3"`, `"11,6\n3,8"`.
   * The following input is **not ok**: `“1,\n2”` (not need to prove it - just clarifying).
2. Support different delimiters.
   * To change a delimiter, the beginning of the string will contain a separate line that looks like this: `“//[delimiter]\n[numbers…]”`. For example, `“//;\n1;2”` should return 3 where the default delimiter is `;`.
   * The first line is optional. All existing scenarios should still be supported.
3. If the input contains a negative number, the calculator will throw an exception `“Negatives not allowed”` - and the negative that was passed. If there are multiple negatives, show all of them in the exception message.
4. Numbers bigger than 1000 should be ignored, so that 2 + 1001 = 2.
5. Delimiters can be of any length with the following format: `“//[delimiter]\n”`. For example, `“//[:::]\n1:::2:::3”` should return 6.
6. Allow multiple delimiters like this: `“//[delim1][delim2]\n”`. For example, `“//[:][°]\n1:2°3”` should return 6.
7. Make sure you can also handle multiple delimiters with length longer than one char.
