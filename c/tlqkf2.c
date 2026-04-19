#include <stdio.h>
#include <stdlib.h>

typedef struct Data{ // 연결 리스트를 구현
    int value;
    struct Data *next;
} Data;

// Data의 주소를 반환하는 함수
Data* insert(Data* head, int value){  // insert 함수는 새로운 node를 생성해서, 이전 노드에
    Data* new_node = (Data*)malloc(sizeof(Data)); // 새로운 노드를 Data 크기에 맞게 생성
    new_node->value = value;
    new_node->next = head;
    return new_node;
}

Data* reconnect(Data* head, int value){
    if (head == NULL || head->value == value) return head;
    Data* prev = NULL, *curr = head;
    
    printf("head는 %d \n", head->value);// ####

    while (curr != NULL && curr->value != value){
        prev = curr;
        curr = curr->next;
    }
    
    printf("prev는 %d \n", prev->value);// ####
    printf("curr %d \n", curr->value);// ####

    if (curr != NULL && prev != NULL){
        prev->next = curr->next;  
        curr->next = head;
    }
    return head;
}

void main(){

          // ###
    Data *head = NULL, *curr;

    for (int i = 1; i <= 5; i ++)
        // ###
        head = insert(head, i); // 자동적으로 head가 초기화됨 insert 함수의 이전 return 값인, 
                                // 이전 for문 단계의 new_node(1)가 새로운 노드(2)의 heae가 됨.
                                // 따라서 1 > 2 > 3 이 아니라 1 < 2 < 3 < 4 < 5 임

    printf("##################################################### ");                        
    printf("%p\n", (void*)head);
    printf("%p\n", (void*)head->next);
    printf("%p\n", (void*)head->next->next);
    printf("%p\n", (void*)head->next->next->next);
    printf("%p\n", (void*)head->next->next->next->next);

    printf("%d\n", head->value);
    printf("%d\n", head->next->value);
    printf("#####################################################\n");

    head = reconnect(head, 3); // 1 < 2 < 4 < 5 < 3
                               // 3이 없어진게 아님. head 뒤로 붙여버리는거임
    
    for (curr = head; curr != NULL; curr = curr->next)
        printf("%d", curr->value);
    
}