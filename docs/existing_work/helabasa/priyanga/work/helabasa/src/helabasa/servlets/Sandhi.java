 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n R u l e ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B S c o r i n g A l g o r i t h m R e g i s t r y ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . W e b U t i l s ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 p u b l i c   c l a s s   S a n d h i   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
 	 p r i v a t e   l o n g   l M a x S c o r e   =   0 ;  
 	 p r i v a t e   S t r i n g   s R e s u l t   =   " T e s t " ;  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
         	 S t r i n g   s L e f t   =     W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " t l e f t " ) ) ;  
         	 S t r i n g   s R i g h t   =   W e b U t i l s . D e c o d e P a r a m e t e r ( o R e q . g e t P a r a m e t e r ( " t r i g h t " ) ) ;  
         	 S t r i n g   s A l g o   =   o R e q . g e t P a r a m e t e r ( " o a l g o " ) ;  
         	 i f ( s A l g o = = n u l l )  
         	 {  
         	 	 s A l g o   =   " F e q u e n c e   B a s e d   S c o r i n g " ;  
         	 }  
         	  
         	 l M a x S c o r e   =   0 ;  
         	 s R e s u l t   =   " " ;  
         	  
         	 i f ( s L e f t = = n u l l   | |   s R i g h t = = n u l l )  
         	 {  
         	 	 p r i n t P a g e ( o R e s ,   0 ,   " " ,   " " ,   s A l g o ) ;  
         	 }      
         	 e l s e   i f ( s L e f t . t r i m ( ) . l e n g t h ( ) = = 0   | |   s R i g h t . t r i m ( ) . l e n g t h ( ) = = 0 )  
         	 {  
         	 	 p r i n t P a g e ( o R e s ,   1 ,   s L e f t . t r i m ( ) ,   s R i g h t . t r i m ( ) ,   s A l g o ) ;  
         	 }  
         	 e l s e  
         	 {  
         	 	 p r i n t P a g e ( o R e s ,   2 ,   s L e f t . t r i m ( ) ,   s R i g h t . t r i m ( ) ,   s A l g o ) ;  
         	 }         	         	  
  
         }  
 	  
 	 p r i v a t e   v o i d   p r i n t A l g o L i s t ( P r i n t W r i t e r   o u t ,   S t r i n g   s A l g o )   t h r o w s   I O E x c e p t i o n  
 	 {  
 	 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < b > S c o r i n g   A l g o r i t h m   :   < / b > < s e l e c t   i d = ' o a l g o '   n a m e = ' o a l g o ' > " ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   H B S c o r i n g A l g o r i t h m R e g i s t r y . G e t A l g o r i t m C o u n t ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 S t r i n g   s A l g o N a m e   =   H B S c o r i n g A l g o r i t h m R e g i s t r y . g e t S c o r i n g A l g o r i t h m N a m e ( i ) ;  
 	 	 	 i f ( s A l g o N a m e ! = n u l l   & &   s A l g o N a m e . e q u a l s ( s A l g o ) )  
 	 	 	 {  
 	 	 	 	 o u t . p r i n t l n ( " < o p t i o n   v a l u e = ' "   +   s A l g o N a m e   +   " '   s e l e c t e d > "   +   s A l g o N a m e   +   " < / o p t i o n > " ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o u t . p r i n t l n ( " < o p t i o n   v a l u e = ' "   +   s A l g o N a m e   +   " ' > "   +   s A l g o N a m e   +   " < / o p t i o n > " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 o u t . p r i n t l n ( " < / s e l e c t > < / p > " ) ;  
 	 }  
          
         p r i v a t e   v o i d   p r i n t P a g e ( H t t p S e r v l e t R e s p o n s e   o R e s ,   i n t   i T y p e ,   S t r i n g   s L e f t ,   S t r i n g   s R i g h t ,   S t r i n g   s A l g o )   t h r o w s   I O E x c e p t i o n  
         {  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 8 " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   S a n d h i < / t i t l e > < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > a   { t e x t - d e c o r a t i o n : n o n e ; } \ n a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } \ n < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / i n d e x . h t m l ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > S a n d h i   (����� )   < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f s a n d h i '   a c t i o n = . / s a n d h i   a l i g n = ' c e n t e r ' > " ) ;  
                 	 	  
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' t e x t '   n a m e = ' t l e f t '   v a l u e = ' "   +   s L e f t   +   " '   s t y l e = ' f o n t - s i z e :   2 0 ' >   < b > + < / b >   " ) ;  
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' t e x t '   n a m e = ' t r i g h t '   v a l u e = ' "   +   s R i g h t   + " '   s t y l e = ' f o n t - s i z e :   2 0 ' > < b r > " ) ;  
                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' J o i n '   s t y l e = ' h e i g h t :   2 e m ;   w i d t h :   4 e m ' > < / p > " ) ;  
                  
                 p r i n t A l g o L i s t ( o u t ,   s A l g o ) ;  
                  
                 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < f o r m   i d = ' f r e s u l t '   a l i g n = ' c e n t e r ' > < i n p u t   t y p e = ' t e x t '   n a m e = ' t r e s u l t '   v a l u e = ' '   s t y l e = ' f o n t - s i z e :   2 0 ' > < / f o r m > < / p > " ) ;  
                  
                 i f ( i T y p e = = 0 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > I n p u t   t h e   t w o   S i n h a l a   w o r d s   t o   j o i n ! < / p > " ) ;  
                 }  
                 e l s e   i f ( i T y p e = = 1 )  
                 {  
                 	 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > O n e   o r   b o t h   w o r d s   a r e   e m p t y !   I n p u t   t h e   t w o   S i n h a l a   w o r d s   t o   j o i n ! < / p > " ) ;  
                 }  
                 e l s e  
                 {  
                 	 P r i n t R e s u l t s T a b l e ( o u t ,   s L e f t ,   s R i g h t ,   s A l g o ) ;  
                 }                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' > r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
                  
                 o u t . p r i n t l n ( " < s c r i p t   t y p e = ' t e x t / j a v a s c r i p t '   l a n g u a g e = ' j a v a s c r i p t ' > " ) ;  
                 o u t . p r i n t l n ( " d o c u m e n t . f o r m s [ ' f r e s u l t ' ] . e l e m e n t s [ ' t r e s u l t ' ] . v a l u e   =   ' "   +   s R e s u l t   +   " ' ; \ n < / s c r i p t > < / b o d y > < / h t m l > " ) ;                  
                  
                  
         }  
          
         p u b l i c   v o i d   P r i n t R e s u l t s T a b l e ( P r i n t W r i t e r   o u t ,   S t r i n g   s L e f t ,   S t r i n g   s R i g h t ,   S t r i n g   s A l g o )  
         {  
         	 o u t . p r i n t l n ( " < b r > < h r > < p   a l i g n = ' c e n t e r ' > < h 4   a l i g n = ' c e n t e r ' > W o r k i n g s < / h 4 > < / p > " ) ;  
         	  
         	 o u t . p r i n t l n ( " < t a b l e   b o r d e r = 1   a l i g n = ' c e n t e r ' > " ) ;  
         	  
         	 o u t . p r i n t l n ( " < t r > < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > M e t h o d < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > R e s u l t s < / f o n t > < / t d > " ) ;  
         	 o u t . p r i n t l n ( " < t d   b g c o l o r = ' # 3 3 3 3 3 3 ' > < f o n t   c o l o r = ' # f f f f f f ' > F r e q u e n c y < / f o n t > < / t d > < / t r > " ) ;  
         	         	  
         	 i n t   i C o u n t   =   0 ;  
         	  
 	 	 H B J o i n R e s u l t s S e t   o R e s u l t s S e t   =   H B W o r d J o i n e r . J o i n ( n e w   H B W o r d ( s L e f t ) ,   n e w   H B W o r d ( s R i g h t ) ,   H B W o r d J o i n e r . J O I N _ M O D E _ U N I V E R S A L ) ;  
 	 	  
         	 H B J o i n S c o r i n g A l g o r i t h m   o A l g o   =   H B S c o r i n g A l g o r i t h m R e g i s t r y . g e t S c o r i n g A l g o r i t h m ( s A l g o ) ;  
         	  
         	 / / o u t . p r i n t l n ( " E v a l u a t i n g   M e t h o d   "   +   H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ i M e t h o d ]   +   "   u s i n g   "   +   o A l g o . G e t N a m e ( )   +   "   a l g o r i t h m . < b r > "   ) ;                 	  
         	 o A l g o . E v a l u a t e ( o R e s u l t s S e t ) ;  
         	 F i n d B e s t R e s u l t s ( o R e s u l t s S e t ) ;  
         	  
 	 	 f o r ( i n t   i = H B W o r d J o i n R u l e . P O O R W A _ S W A R A _ L O P A ;   i < H B W o r d J o i n R u l e . M A X _ S A N D H I _ I D   +   1 ;   i + + )  
 	 	 {  
         	 	 i C o u n t   + =   P r i n t R e s u l t s R o w ( o u t ,   o R e s u l t s S e t ,   i ,   s L e f t ,   s R i g h t ) ;  
 	 	 }  
         	  
         	 o u t . p r i n t l n ( " < / t a b l e > " ) ;  
         	  
         	 i f ( i C o u n t > 1 )  
         	 {  
         	 	 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > "   +   i C o u n t   +   "   d i f f e r e n t   j o i n e d   f o r m s   a r e   g e n e r a t e d   f o r   [ "   +   s L e f t   +   " ]   a n d   [ "   +   s R i g h t   +   " ] . < / p > " ) ;  
         	 }  
         	 e l s e   i f ( i C o u n t = = 1 )  
         	 {  
         	 	 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > 1   j o i n e d   f o r m   i s   g e n e r a t e d   f o r   [ "   +   s L e f t   +   " ]   a n d   [ "   +   s R i g h t   +   " ] . < / p > " ) ;  
         	 }  
         	 e l s e   i f ( i C o u n t = = 0 )  
         	 {  
         	 	 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > N o   j o i n e d   f o r m   i s   g e n e r a t e d   f o r   [ "   +   s L e f t   +   " ]   a n d   [ "   +   s R i g h t   +   " ] . < / p > " ) ;  
         	 }  
         }  
          
         p r i v a t e   v o i d   F i n d B e s t R e s u l t s ( H B J o i n R e s u l t s S e t   o R e s u l t S e t )  
         {  
         	 i n t   i C o u n t   =   o R e s u l t S e t . G e t R e s u l t s C o u n t ( ) ;  
         	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o W o r d   =   o R e s u l t S e t . G e t R e s u l t s A t ( i ) . G e t R e s u l t ( ) ;  
 	 	 	  
 	 	 	 i f ( o W o r d . G e t F r e q u e n c y ( )   >   l M a x S c o r e )  
 	 	 	 {  
 	 	 	 	 l M a x S c o r e   =   o W o r d . G e t F r e q u e n c y ( ) ;  
 	 	 	 	 s R e s u l t   =   o W o r d . G e t N a t u r a l F o r m ( ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " F i n d B e s t R e s u l t s   :   R e s u l t = "   +   s R e s u l t   +   "   :   S c o r e = "   +   l M a x S c o r e   +     " . < b r > "   ) ;      
 	 	  
         }  
          
         p r i v a t e   i n t   P r i n t R e s u l t s R o w ( P r i n t W r i t e r   o u t ,   H B J o i n R e s u l t s S e t   o R e s u l t S e t ,   i n t   i M e t h o d ,   S t r i n g   s L e f t ,   S t r i n g   s R i g h t )  
         {             	         	         	  
         	 i n t   i C o u n t   =   o R e s u l t S e t . G e t R e s u l t s C o u n t ( i M e t h o d ) ;  
         	  
         	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " P r i n t R e s u l t s R o w   :   M e t h o d = "   +   i M e t h o d   +     "   :   C o u n t =   " +   i C o u n t     + " < b r > "   ) ;  
         	  
 	 	 o u t . p r i n t l n ( " < t r > < t d > " +   H B W o r d J o i n R u l e . s a r _ S a n d h i N a m e s [ i M e t h o d ]     + " < / t d > < t d > " ) ;  
 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o W o r d   =   o R e s u l t S e t . G e t R e s u l t s A t ( i M e t h o d ,   i ) . G e t R e s u l t ( ) ;  
 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 {  
 	 	 	 	 o u t . p r i n t l n ( o W o r d . G e t N a t u r a l F o r m ( ) ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o u t . p r i n t l n ( o W o r d . G e t N a t u r a l F o r m ( )   +   " < b r > " ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 o u t . p r i n t l n ( " < / t d > < t d > " ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B W o r d   o W o r d   =   o R e s u l t S e t . G e t R e s u l t s A t ( i M e t h o d ,   i ) . G e t R e s u l t ( ) ;  
 	 	 	 	 	 	  
 	 	 	 i f ( i = = i C o u n t - 1 )  
 	 	 	 {  
 	 	 	 	 o u t . p r i n t l n ( o W o r d . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o u t . p r i n t l n ( o W o r d . G e t F r e q u e n c y ( )   +   " < b r > " ) ;  
 	 	 	 }  
 	 	 }         	 	  
 	 	  
 	 	 o u t . p r i n t l n ( " < / t d > < / t r > " ) ;  
  
         	 r e t u r n   i C o u n t ;  
         }    
 }  
