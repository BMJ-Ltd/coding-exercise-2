
package reverse.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReverseController {


	/**
	 * As a user I want to reverse the order of letters in a set of words so that I see a list of backwards words.
	 * You are not allowed to use the StringBuffer or StringBuilder classes.
	 */
	@PostMapping(value = "/reverse")
	@ResponseBody
	public List<String> getReverseWord(@RequestBody final List<String> words)
	{
		return words;
	}


	/**
	 * As a user I want to check if an integer in my list is a palindrome so that I see a list of palindrome integers.
	 * An integer is called palindrome if it is equal to its reverse e.g. 1001 is a palindrome but 1234 is not because
	 * the reverse of 1234 is 4321 which is not equal to 1234.
	 */
	@PostMapping(value = "/intpalindrome")
	@ResponseBody
	public List<Integer> gePalindrome(@RequestBody final List<Integer> integers)
	{
		return integers;
	}


	/**
	 * As a user, I want to see a comma-separated string based on a given list of integers. Each element should be
	 * preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
	 * For example, if the input list is (3,44), the output should be 'o3,e44'.
	 */
	@PostMapping(value = "/commasep")
	@ResponseBody
	public List<String> filter(@RequestBody final List<String> words)
	{
		return words;
	}

}
