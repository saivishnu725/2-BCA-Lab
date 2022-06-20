#include<stdio.h>

int gcd(int a, int b){
		if(b == 0)
				return a;
		else
				return gcd(b, a%b);
}

int main(){
		int a, b;
		printf("Enter two numbers: ");
		scanf("%d %d", &a, &b);

		printf("GCD = %d\n", gcd(a, b));
		return 0;
}
/*
Output - 


Enter two numbers: 6 3
GCD = 3


*/
