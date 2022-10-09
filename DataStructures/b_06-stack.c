#include<stdio.h>

#define MAX 10
int top = -1;
int s[MAX];

void push(){
		if(top == (MAX - 1))
				printf("Stack is full\n");
		else{
				printf("Enter the item: ");
				top++;
				scanf("%d", &s[top]);
		}
}

void pop(){
		//printf("%d\n", top);
		if(top == -1)
				printf("Stack is empty.\n");
		else{
				printf("Popped item is %d\n", s[top]);
				top--;
		}
}

void display(){
		int i;
		printf("Stack: ");
		for(i = 0; i <= top; i++)
				printf("%d ", s[i]);
}

int main(){
		int choice;
		while(1){
				printf("\n\n\n\n\t\t\tStack\n");
				printf("1.\tPush\n");
			printf("2.\tPop\n");
				printf("3.\tDisplay\n");
			printf("4.\tExit\n");
			printf("Enter your choice: ");
			scanf("%d", &choice);
				switch(choice){
						case 1:
								push();
								break;
						case 2:
								pop();
								break;
						case 3:
								display();
								break;
						case 4:
								return 0;
						default:
								printf("Invalid choice!!\n");
				}
		}

		return 0;
}

