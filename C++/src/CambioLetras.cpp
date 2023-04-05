#include <iostream>
#include <cstring>
using namespace std;

int main(int argc, char const *argv[])
{
    std::string cadena = "La lluvia en Sevilla es una maravilla";
    char convert[50];
    strcpy(convert, cadena.c_str());

    cout << convert << "\n";

    return 0;
}
