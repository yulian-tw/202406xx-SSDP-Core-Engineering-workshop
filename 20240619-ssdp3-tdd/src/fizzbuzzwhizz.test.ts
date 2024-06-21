import fizzBuzzWhizz from "./fizzbuzzwhizz";

describe('should reject if invalid inputs', () => {
    it.only('when less than three numbers given', () => {
        const numbers = [1, 2];
        expect(() => fizzBuzzWhizz(numbers)).toThrowError('Invalid input');

    });
    it('when more than three numbers given', () => {

    });
    it('when zero is given to prevent logical errors', () => {
    });
    it('when numbers are not distinct', () => {

    });
    it('when not a single digit number', () => {

    });
});

describe('should return number itself when not multiply of any number', () => {

});

describe('should Fizz when multiply of the first number', () => {

});

describe('should Buzz when multiply of the second number', () => {

});

describe('should Whizz when multiply of the third number', () => {

});

describe('should FizzBuzz when multiply of first and second numbers', () => {

});

describe('should FizzWhizz when multiply of first and third numbers', () => {

});

describe('should BuzzWhizz when multiply of second and third numbers', () => {

});

describe('should FizzBuzzWhizz when multiply of all three numbers', () => {

});