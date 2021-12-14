package interfaces;
import java.util.*;
import java.lang.*;
import classes.*;

public interface IGameOperations
{
  void insertGame(Game g);
  void removeGame(Game g);
  Game getGame(int id);
  void showAllGames();
  void showGameList();
  void calculateGameCount();
}
