package com.shree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubstractController {

	@RequestMapping("/subtract")
	public String doSubtract(@RequestParam(defaultValue="0") String minuend,
			@RequestParam(defaultValue="0") String subtrahend) {

		int m = Integer.valueOf(minuend);
		int s = Integer.valueOf(subtrahend);
		int difference = m - s;

		return "{\"minuend\":\"" + minuend + "\", \"subtrahend\":\"" + subtrahend + "\", \"difference\": \"" + difference + "\"}";
	}
}
