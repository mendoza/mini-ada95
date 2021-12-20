.data
 newline: .asciiz "\n"
   .text
   .globl main
main:
       move $fp, $sp
_Program:
       sw $fp, -4($sp)
       sw $ra, -8($sp)

       li $s4, 0

       li $s13, 1