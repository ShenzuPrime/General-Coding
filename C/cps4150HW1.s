	.section	__TEXT,__text,regular,pure_instructions
	.macosx_version_min 10, 11
	.globl	_addnums
	.align	4, 0x90
_addnums:                               ## @addnums
## BB#0:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$8, %esp
	movl	12(%ebp), %eax
	movl	8(%ebp), %ecx
	movl	%ecx, -4(%ebp)
	movl	%eax, -8(%ebp)
	movl	-4(%ebp), %eax
	addl	-8(%ebp), %eax
	addl	$8, %esp
	popl	%ebp
	retl

	.globl	_main
	.align	4, 0x90
_main:                                  ## @main
## BB#0:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$40, %esp
	calll	L1$pb
L1$pb:
	popl	%eax
	movl	12(%ebp), %ecx
	movl	8(%ebp), %edx
	movl	%edx, -4(%ebp)
	movl	%ecx, -8(%ebp)
	movl	-8(%ebp), %ecx
	movl	4(%ecx), %ecx
	movl	%ecx, (%esp)
	movl	%eax, -24(%ebp)         ## 4-byte Spill
	calll	_atoi
	movl	%eax, -12(%ebp)
	movl	-8(%ebp), %eax
	movl	8(%eax), %eax
	movl	%eax, (%esp)
	calll	_atoi
	movl	%eax, -16(%ebp)
	movl	-12(%ebp), %eax
	movl	-16(%ebp), %ecx
	movl	%eax, (%esp)
	movl	%ecx, 4(%esp)
	calll	_addnums
	movl	-24(%ebp), %ecx         ## 4-byte Reload
	leal	L_.str-L1$pb(%ecx), %edx
	movl	%eax, -20(%ebp)
	movl	-20(%ebp), %eax
	movl	%edx, (%esp)
	movl	%eax, 4(%esp)
	calll	_printf
	xorl	%ecx, %ecx
	movl	%eax, -28(%ebp)         ## 4-byte Spill
	movl	%ecx, %eax
	addl	$40, %esp
	popl	%ebp
	retl

	.section	__TEXT,__cstring,cstring_literals
L_.str:                                 ## @.str
	.asciz	"%d\n"


.subsections_via_symbols
