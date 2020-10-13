package com.company;


public class HashTable {
    private int size;
    private List<String> mas[];

    public int size(){
        return size;
    }

    private static int hashCod(String element,int size){
        int sum=0;
        for(int i=0;i<element.length();i++){
            sum+=(int)element.charAt(i);
        }
        int hashCode=sum%size;
        return hashCode;
    }

    public void add(String element){
        int hash=hashCod(element,size);
        int size_of_list=mas[hash].size();
        boolean has_or_not=false;
        for(int i=0;i<size_of_list;i++){
            if(mas[hash].get(i).equals(element)){
                mas[hash].set(i,element);
                has_or_not=true;
                break;
            }
        }
        if(!has_or_not)mas[hash].addLast(element);
    }

    public boolean find(String element){
        int hash=hashCod(element,size);
        int size_of_list=mas[hash].size();
        boolean has_or_not=false;
        for(int i=0;i<size_of_list;i++){
            if(mas[hash].get(i).equals(element)){
                has_or_not=true;
                break;
            }
        }
        return  has_or_not;
    }

    public void remove(String element){
        int hash=hashCod(element,size);
        int size_of_list=mas[hash].size();
        for(int i=0;i<size_of_list;i++){
            if(mas[hash].get(i).equals(element)){
                mas[hash].remove(i);
                break;
            }
        }
    }

    public  List<String> get(int index){
        return mas[index];
    }

    public  HashTable(int size){
        this.size=size;
        this.mas=(List<String>[]) new List[size];
        for(int i=0;i<size;i++){
            mas[i]=new List<String>();
        }
    }
}
