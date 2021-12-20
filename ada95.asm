.data
 newline: .asciiz "\n"
   .text
   .globl main
main:
       move $fp, $sp

       li $s4, 1
_etiq1:

       li $s8, 1
_etiq3:

       move $t0, $s8

       li $t1, 20
       ble $t0, $t1, _etiq4

       b _etiq2
_etiq5:

       move $t0, $s8
       li $t1, 1
       add $t2, $t1, $t0
       move $s8, $t2

       b _etiq3
_etiq4:

       move $t0, $s4
       move $t1, $s8
       mul $t2, $t1, $t0
       move $s4, $t2

       b _etiq5
_etiq2:

       li $v0, 1
       move $a0, $s4
       syscall
       li $v0, 4
       la $a0, newline
       syscall

       li $v0,10
       syscall
