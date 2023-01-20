# Test Task for Tinkoff One Day Offer

This code implemented for Tinkoff's One Day Offer challenge. Time limit for this task was 1 hour.

## Task Description

Someone is trying to save money for a new video card. He starts on Monday with 1 coin and every next day adds 1 coin
more than the previous day to the piggy bank (Monday 1 coin, Tuesday 2 coins, Wednesday 3 coins, etc.). Starting from
the next week, he saves one coin more than on the previous Monday (the first Monday is 1 coin, the second Monday is 2
coins, the third Monday is 3 coins, and so on). We need to write a function to count the money saved by the number of
days starting from the first Monday.

## Limitation

N (number of days) must be in range 1..1000 inclusive.

## Test Cases

* calculateDeposit(6): Monday 1 coin + Tuesday 2 coins + Wednesday 3 coins + Thursday 4 coins + Friday 5 coins + Saturday 6 coins = 21 coins;
* calculateDeposit(10): First week (1 coin + 2 coins + 3 coins + 4 coins + 5 coins + 6 coins + 7 coins) + Second week (2 coins + 3 coins + 4 coins) = 37 coins;

## License

This project is licensed under the MIT License.
