// returns the number of characters in the input word

#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "Enter a word \n";
	string word;
	cin >> word;

	int count = 0;
	
	while (word.length() != 0) {
		word.erase(0, 1);
		//cout << word << endl;
		count ++;
	}
	cout << count << endl;
	
	return 0;
}
