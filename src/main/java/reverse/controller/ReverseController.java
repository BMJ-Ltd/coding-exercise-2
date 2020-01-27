
package reverse.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

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
		if(words==null) return null;
		List<String> words1 = new ArrayList<String>();
		for(String w:words){
			if(w!=null)
				words1.add(w);
		}
		words.clear();

		for (int j=0;j<words1.size();j++){
			String word = words1.get(j);
			char[] chars = word.toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i=word.length()-1;i>=0;i--)
			{
				sb.append(chars[i]);
			}
			words.add(sb.toString());
		}
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
		if(integers==null) return null;
		List<Integer> integers1 = new ArrayList<Integer>();
		for(Integer d:integers){
			if(d!=null)
				integers1.add(d);
		}


		return integers1.stream().filter((d)->{
			String s = d.toString();
			char[] a = s.toCharArray();

			for(int i=0;i<(int)(s.length()/2)-1;i++){
				if(a[i]!=a[s.length()-i-1])
				{
					return false;
				}
			}
			return true;		}).collect(Collectors.toList());
	}



	/**
	 * As a user, I want to see a comma-separated string based on a given list of integers. Each element should be
	 * preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
	 * For example, if the input list is (3,44), the output should be 'o3,e44'.
	 */
	@PostMapping(value = "/commasep")
	@ResponseBody
	public String getCommaSeperatedString(@RequestBody final List<Integer> words)
	{
		StringBuilder sb = new StringBuilder();
		for(Integer d: words){
			if(d%2==0){
				sb.append("e"+d.toString());
			}else
				sb.append("o"+d.toString());

		}


		String str = sb.toString();
		if(!str.isEmpty())
			str = str.substring(0, str.length()-1);
		return str;
	}
}
