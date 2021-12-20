.data
 newline: .asciiz "\n"
   .text
   .globl main
main:
       move $fp, $sp

       li $s4, 0

       li $s12, 0

       li $s13, 0_etiq1:

       li $s4, 1
_etiq3:

       move $t0, $s4

       li $t1, 1
       ble $t0, $t1, _etiq4

       b _etiq2
_etiq5:

       move $t0, $s4
       li $t1, 1
       add $t2, $t1, $t0
       move $s4, $t2

       b _etiq3
_etiq4:

       li $v0, 1
       syscall
       move $s4, $v0

       b _etiq5
_etiq2:

       li $s12, 2.0

       li $s13, 1_etiq7:
_etiq9:

       move $t0, $s4

       li $t1, 3
       bgt $t0, $t1, _etiq10

       b _etiq8
_etiq10:

       move $t0, $s4

       li $t1, 3
       bgt $t0, $t1, _etiq12

       move $t0, $s4

       li $t1, 0
       blt $t0, $t1, _etiq12

       li $t0, #t2

       li $t1, #t4

       b _etiq11
_etiq12:

       move $t0, $s4

       li $t1, 2
       beq $t0, $t1, _etiq11

       b _etiq11
_etiq11:

       move $t0, $s4
       li $t1, 1
       add $t2, $t1, $t0
       move $s4, $t2

       b _etiq9
_etiq8:

       li $v0,10
       syscall
