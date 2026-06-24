#include <stdio.h>
#include <stdlib.h>

typedef struct Data{ // 연결 리스트를 구현
    int value;
    struct Data *next; 
    
} Data;   // typedef [자료형] [별명];
          // typedef [struct Data] [Data]


// Data의 주소를 반환하는 함수
Data* insert(Data* head, int value){  // insert 함수는 새로운 node를 생성해서, 이전 노드에
    Data* new_node = (Data*)malloc(sizeof(Data)); // 새로운 노드를 Data 크기에 맞게 생성
    new_node->value = value;
    new_node->next = head;
    return new_node;
}
Data* reconnect(Data* head, int value){}
Data* show(Data* head, int value){printf("%d", head->value);}

void main(){

    Data* head = NULL; // 초기 리스트

    int menu; 

    Data* (*fn[])(Data*, int) = {insert, reconnect, reconnect, show};
    while(1){
        printf("=================\n0.exit\n1.insert\n2.reconnect\n3.show\n");
        scanf("%d", &menu); 
        if (menu == 0){break;}

        // insert
        if (menu == 1){
            printf("value>>>");
            int value; scanf("%d", &value);
            head = fn[menu-1](head, value);
        }
        // show
        if (menu == 3){
            fn[menu-1](head, 0);
        }
        
    }

}