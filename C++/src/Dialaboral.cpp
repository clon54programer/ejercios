#include <iostream>
#include <ctype.h>

using namespace std;

int main(int argc, char const *argv[])
{
    cout << "coloque un dia de la semana, para ver si le toca trabajar\n";
    string day;

    cin >> day;

    // programa
    if (day == "lunes" || day == "martes" || day == "miercoles" || day == "jueves" || day == "viernes")
    {
        cout << "te toca trabajar\n";
    }
    else if (day == "sabado" || "domingo")
    {
        cout << "no el toca trabajar";
    }

    return 0;
}