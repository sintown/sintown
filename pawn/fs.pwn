#include <a_samp>

// load module maps
#include "20170601-garage.txt"
#include "20200405-vila-inca.txt"

main()
{
	print("**************************************");
 	print("*                                    *");
 	print("**************************************");
}

public OnGameModeInit()
{
    garage();
    vilainca();
    return 1;
}

public OnPlayerConnect(playerid)
{
    vilaincaplayer(playerid);
    return 1;
}
