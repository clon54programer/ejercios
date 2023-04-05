#include <iostream>
#include <cstring>
using namespace std;

int main(int argc, char const *argv[])
{
    std::string cadena = "La lluvia en Sevilla es una maravilla";
    char convert[100];
    strcpy(convert, cadena.c_str());

    return 0;
}
