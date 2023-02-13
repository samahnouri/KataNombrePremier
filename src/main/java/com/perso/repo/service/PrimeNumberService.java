package com.perso.repo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumberService {
	
	public List<Integer> calculate(Integer argument) {
		if (argument < 2)
			throw new IllegalArgumentException("L'argument est inf à 2");
		return IntStream.rangeClosed(2, argument)
				.filter(PrimeNumberService::isPrime)
				.boxed()
				.collect(Collectors.toList());
	}
	
	private static boolean isPrime(int number) {
		if (number <= 1) return false; // 1 is not prime and also not composite
		return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
	}
}
