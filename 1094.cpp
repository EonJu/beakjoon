#include <iostream>
using namespace std;

int main()
{
	int cnt = 0, tmp, sum = 0, x, stick=64;

	cin >> x;
	tmp = x;
	while (sum != x)
	{
		if (stick <= tmp)
		{
			cnt++;
			sum += stick;
			tmp -= stick;
		}
		stick = stick/2;
	}

	cout<< cnt << endl;
	
	return 0;
}