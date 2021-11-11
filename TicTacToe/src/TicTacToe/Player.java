/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Lenovo
 */
public class Player {
    private String name;
    private int score;
public Player(String name,int score)
{
    this.name=name;
    this.score=score;
}
public String getName(){
    return this.name;
}
public int getScore()
{
    return this.score;
}
public void setName(String name){
    this.name=name;
}
public String toString(){
    return this.getName()+","+this.getScore()+"\n";
}
public void setScore(int score){
    this.score=score;
}
}
