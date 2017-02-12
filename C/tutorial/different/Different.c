#include <stdio.h>

int main(int argc, char *argv[]) {
	long long a;
	long long b;
	char str[100];
	gets(str);
	while (str != 'EOF') {
		a = str;
		gets(str);
		b = str;
		gets(str);
		long long c = a - b;
		if (c < 0) {
			c = c * -1;
		}
		puts(c);
	}
	return 0;
}
