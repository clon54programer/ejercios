#include <iostream>
#include <string>

using namespace std;

int main(int argc, char const *argv[])
{
    cout << "deme un numero \n";
    int number;

    cin >> number;

    if (number < 0)
    {
        cout << "el numero es negativo\n";
    }
    else
    {
        string Cadena = std::to_string(number); // convierte el numero a string

        cout << "el numero ingresado tiene " << Cadena << " cifras\n";
    }

    return 0;
}
