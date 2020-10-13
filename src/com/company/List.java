package com.company;

public  class List<String> {
    private int size=0;
    private Entery<String> first;
    private Entery<String> last;
    public List(){
        last=new Entery<String>(null,null);
        first=new Entery<String>(null,last);
    }
    public int size(){
        return size;
    }
    public void addLast(String a){
        Entery<String> prev=last;
        prev.setCurrentElement(a);
        last=new Entery<String>(null,null);
        prev.setNextElement(last);
        size++;
    }
    public String get(int index){
        Entery<String> target=first.getNextElement();
        for(int i=0; i<=index-1 ;i++){
            target=getNextElement(target);
        }
        return target.getCurrentElement();
    }

    public void remove(int index){
        Entery<String> current=first;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        current.next=current.next.next;
        size--;
    }

    public void set(int index,String element){
        Entery<String> current=first;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        Entery<String> new_element=new Entery<String>(element,current.next.next);
        current.next=new_element;
    }

    public Entery<String> getNextElement(Entery<String> current){//метод возвращающий ссылку текущего элемента на следующий
        return current.getNextElement();
    }
    public static class Entery<String>{
        String element;
        Entery<String> next;
        Entery(String element,Entery<String> next){
            this.element=element;
            this.next=next;
        }
        public String getCurrentElement(){//метод возвращающий значение текущего элемента
            return element;
        }
        public void setCurrentElement(String element){//метод устанавливающий значение текущего элемента
            this.element=element;
        }
        public Entery<String> getNextElement(){//метод возвращающий ссылку на следующий
            return next;
        }
        public void setNextElement(Entery<String> next){//метод устанавливающий ссылку на следующий элемент
            this.next=next;
        }
    }
}