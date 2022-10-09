#include<stdio.h>
#include<string.h>

int main(){
		int i, j, n;
		char str[100][100], s[100];
		
		printf("Enter the number of cities: ");
		scanf("%d", &n);

		printf("Enter %d cities: ", n);
		for(i = 0; i < n; i++)
				scanf("%s", &str[i]);

		for(i = 0; i < n; i++){
				//printf("\t\ti=%s\n", str[i]);
				for(j = i + 1; j < n; j++){
						//printf("\t\t\t\twhen i=%d j=%s\n", i, str[j]);
						if(strcmp(str[i], str[j]) > 0){
								//printf("str[i]=%s\t\tstr[j]=%s\n", str[i], str[j]);
								strcpy(s, str[i]);
								strcpy(str[i], str[j]);
								strcpy(str[j], s);
						}
				}
		}

		printf("Sorted list of cities: ");
		for(i = 0; i < n; i++)
				printf("%s ", str[i]);
		printf("\n");

		return 0;
}
