 p a c k a g e   h e l a b a s a . s e r v l e t s . u t i l s ;  
  
 i m p o r t   h e l a b a s a . H B U s e r ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e s s i o n ;  
  
 p u b l i c   c l a s s   A d m i n L o g i n   {  
 	  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   H B _ A U T H _ C H E C K _ S T R   =   " H E L A B A S A _ A U T H E N T I C A T E D " ;  
 	  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   H B _ A U T H _ U I D _ P A R A M   =   " H E L A B A S A _ U I D _ P A R A M " ;  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   H B _ A U T H _ U S E R N A M E _ P A R A M   =   " H E L A B A S A _ U S E R N A M E _ P A R A M " ;  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   H B _ A U T H _ U S E R _ R O L E _ I D _   =   " H E L A B A S A _ U S E R _ R O L E _ I D " ;  
 	  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   H B _ A U T H _ P A R A M   =   " H B _ A U T H _ P A R A M " ;  
 	  
 	  
 	 p u b l i c   A d m i n L o g i n ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   s t a t i c   b o o l e a n   V e r i f y ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	 	 t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
 	 {  
 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ;  
 	 	 S t r i n g   s A u t h P a r a m   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ P A R A M ) ;  
 	 	  
 	 	 S t r i n g   s L o g o u t   =   o R e q . g e t P a r a m e t e r ( " b L o g o u t " ) ;  
  
 	 	 i f ( s L o g o u t ! = n u l l   & &   s L o g o u t   ! = " " )  
 	 	 {  
 	 	 	 L o g o u t ( o R e q ,   o R e s ) ;  
 	 	 	 P r i n t L o g o u t P a g e ( o R e q ,   o R e s ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	 	 	  
 	 	 e l s e   i f ( s A u t h P a r a m ! = n u l l   & &   s A u t h P a r a m . e q u a l s ( H B _ A U T H _ C H E C K _ S T R ) )  
 	 	 {  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 P r i n t L o g i n P a g e ( o R e q ,   o R e s ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   L o g o u t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	 	 t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
 	 {  
 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ; 	 	  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ P A R A M ,   " " ) ;  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ U I D _ P A R A M ,   " " ) ;  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ U S E R N A M E _ P A R A M ,   " " ) ; 	 	 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s h o r t   G e t U s e r I D ( H t t p S e r v l e t R e q u e s t   o R e q ) 	 	 	  
 	 {  
 	 	 t r y  
 	 	 {  
 	 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ;  
 	 	 	 S t r i n g   s A u t h P a r a m   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ P A R A M ) ;  
 	 	 	 	 	 	  
 	 	 	 i f ( s A u t h P a r a m ! = n u l l   & &   s A u t h P a r a m . e q u a l s ( H B _ A U T H _ C H E C K _ S T R ) )  
 	 	 	 {  
 	 	 	 	 S t r i n g   s U I D   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ U I D _ P A R A M ) ;  
 	 	 	 	 i f ( s U I D ! = n u l l   & &   s U I D ! = " " ) 	 	 	 	  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   S h o r t . p a r s e S h o r t ( s U I D ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " F a i l e d   t o   g e t   U s e r   I D   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 }  
 	 	 	 	  
 	 	 r e t u r n   - 1 ; 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   S t r i n g   G e t U s e r N a m e ( H t t p S e r v l e t R e q u e s t   o R e q ) 	 	 	  
 	 {  
 	 	 t r y  
 	 	 {  
 	 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ;  
 	 	 	 S t r i n g   s A u t h P a r a m   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ P A R A M ) ;  
 	 	 	 	 	 	  
 	 	 	 i f ( s A u t h P a r a m ! = n u l l   & &   s A u t h P a r a m . e q u a l s ( H B _ A U T H _ C H E C K _ S T R ) )  
 	 	 	 {  
 	 	 	 	 S t r i n g   s U N   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( H B _ A U T H _ U S E R N A M E _ P A R A M ) ;  
 	 	 	 	 i f ( s U N ! = n u l l ) 	 	 	 	  
 	 	 	 	 {  
 	 	 	 	 	 r e t u r n   s U N ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " F a i l e d   t o   g e t   U s e r   N a m e   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   " " ; 	 	  
 	 } 	  
 	  
 	  
 	 p r i v a t e   s t a t i c   v o i d   M a r k A u t h e n t i c a t e d ( H t t p S e r v l e t R e q u e s t   o R e q ,   H B U s e r   o U s e r )  
 	 {  
 	 	 H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ; 	 	  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ P A R A M ,   H B _ A U T H _ C H E C K _ S T R ) ;  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ U I D _ P A R A M ,   S h o r t . t o S t r i n g ( o U s e r . G e t U s e r I D ( ) ) ) ;  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ U S E R N A M E _ P A R A M ,   o U s e r . G e t U s e r N a m e ( ) ) ;  
 	 	 o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ U S E R _ R O L E _ I D _ ,     S h o r t . t o S t r i n g ( o U s e r . G e t U s e r R o l e ( ) ) ) ;  
 	 	  
 	 	 / / o S e s s i o n . s e t A t t r i b u t e ( H B _ A U T H _ P A R A M ,   " I N V A L I D " ) ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   b o o l e a n   A u t h e n t i c a t e ( H t t p S e r v l e t R e q u e s t   o R e q ,   S t r i n g   s U s e r n a m e ,   S t r i n g   s P a s s w o r d )  
 	 {  
 	 	 H B U s e r   o U s e r   =   U s e r D a t a b a s e . G e t U s e r ( s U s e r n a m e ) ;  
 	 	 	 	 	 	  
 	 	 i f ( o U s e r ! = n u l l   & &   o U s e r . G e t U s e r P a s s w o r d H a s h ( ) . e q u a l s ( W e b U t i l s . M D 5 H a s h ( s P a s s w o r d ) ) )  
 	 	 {  
 	 	 	 M a r k A u t h e n t i c a t e d ( o R e q ,   o U s e r ) ;  
 	 	 	 r e t u r n   t r u e ; 	 	 	  
 	 	 } 	 	    
 	 	 e l s e  
 	 	 {  
 	 	 	  
 	 	 	 / / H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ; 	  
 	 	 	 / / o S e s s i o n . s e t A t t r i b u t e ( " A U T H _ M S G " ,   " < b r > P 1 = "   +   s P a s s w o r d   +   " < b r > P 2 = "   +   W e b U t i l s . M D 5 H a s h ( s P a s s w o r d )   +   " < b r > P 3 = "   +   o U s e r . G e t U s e r P a s s w o r d H a s h ( ) ) ; 	 	 	  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	 }  
 	  
         p r i v a t e   s t a t i c   v o i d   P r i n t L o g i n P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n  
         {  
         	 S t r i n g   s U s e r n a m e   =   o R e q . g e t P a r a m e t e r ( " t u s e r n a m e " ) ;  
         	 S t r i n g   s P a s s w o r d   =   o R e q . g e t P a r a m e t e r ( " t p a s s w o r d " ) ;  
         	 i n t   b A u t h S t a t u s   =   0 ;  
         	  
         	 i f ( s U s e r n a m e ! = n u l l   & &   s U s e r n a m e ! = " "   & &   s P a s s w o r d ! = n u l l   & &   s P a s s w o r d ! = " " )  
         	 {  
         	 	 i f ( A u t h e n t i c a t e ( o R e q ,   s U s e r n a m e ,   s P a s s w o r d ) )  
         	 	 {  
         	 	 	 b A u t h S t a t u s   =   1 ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 b A u t h S t a t u s   =   - 1 ;  
         	 	 }  
         	 }  
         	  
         	 i f ( b A u t h S t a t u s   = =   1 )  
         	 {  
         	 	 o R e s . s e n d R e d i r e c t ( " a d m i n _ p a g e " ) ;  
         	 	 / / P r i n t A d m i n P a g e ( o R e s ) ;  
         	 }  
         	 e l s e  
         	 {  
 	         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
 	         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 1 6 b e " ) ;  
 	                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
 	                  
 	                 H e l a b a s a . S e t L o g ( o u t ) ;  
 	                  
 	                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   M e n u < / t i t l e > < / h e a d > " ) ;  
 	                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > " ) ;  
 	                 o u t . p r i n t l n ( " a   { t e x t - d e c o r a t i o n : n o n e ; } " ) ;  
 	                 o u t . p r i n t l n ( " a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } " ) ;  
 	                 o u t . p r i n t l n ( " < / s t y l e > " ) ;  
 	                 o u t . p r i n t l n ( " < b o d y   a l i g h = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
 	                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / h 3 > " ) ;  
 	                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > L o g i n   P a g e < / h 3 > " ) ;  
 	  
 	                 i f ( b A u t h S t a t u s = = - 1 )  
 	                 {  
 	                 	 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > I n v a l i d   u s e r n a m e - p a s s w o r d   p a i r !   P l e a s e   r e t r y ! < / h 3 > " ) ; 	  
 	                 }  
 	                  
 	                 / / H t t p S e s s i o n   o S e s s i o n   =   o R e q . g e t S e s s i o n ( t r u e ) ;  
 	 	 	 / / S t r i n g   s A u t h P a r a m   =   ( S t r i n g )   o S e s s i o n . g e t A t t r i b u t e ( " A U T H _ M S G " ) ;  
 	                  
 	 	 	 / / o u t . p r i n t l n ( " < h 1 > A U T H = "   +   s A u t h P a r a m   +   " < / h 1 > " ) ;  
 	                  
 	                 o u t . p r i n t l n ( " < f o r m   i d = ' f a d m i n '   a c t i o n = . / a d m i n _ p a g e   a l i g n = ' c e n t e r '   m e t h o d = ' p o s t ' > " ) ;  
 	                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
 	                 o u t . p r i n t l n ( " < t a b l e   a l i g n = ' c e n t e r '     s t y l e = ' f o n t - f a m i l y : a r i a l ;   f o n t - s i z e : 0 . 8 e m ; ' > " ) ;  
 	                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > U s e r n a m e < / b > < / t d > < t d > < i n p u t   t y p e = ' t e x t '   i d = ' t u s e r n a m e '   n a m e = ' t u s e r n a m e ' > < / t d > < / t r > " ) ;  
 	                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > P a s s w o r d < / b > < / t d > < t d > < i n p u t   t y p e = ' p a s s w o r d '   i d = ' t p a s s w o r d '   n a m e = ' t p a s s w o r d ' > < / t d > < / t r > " ) ;  
 	                  
 	                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < / t d > < t d > < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' L o g i n '   s t y l e = ' h e i g h t :   2 e m ;   w i d t h :   4 e m ' > < / t d > < / t r > " ) ;                  
 	                 o u t . p r i n t l n ( " < / t a b l e > " ) ;  
 	                 o u t . p r i n t l n ( " < / p > < / f o r m > " ) ;  
 	  
 	                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' >   r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
 	                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;  
         	 }  
         } 	  
          
         p u b l i c   s t a t i c   S t r i n g   G e t L o g o u t P a n e l ( H t t p S e r v l e t R e q u e s t   o R e q )    
         {         	  
         	 t r y  
         	 {  
         	 	 r e t u r n   " < f o r m   i d = ' f L o g o u t '   a c t i o n = . / a d m i n _ p a g e     a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > < p   a l i g n = ' c e n t e r ' >   Y o u   a r e   l o g g e d   i n   a s   < b > < f o n t   c o l o r = ' g r e e n ' > "   +    
                 	 	 A d m i n L o g i n . G e t U s e r N a m e ( o R e q )   +   " < / f o n t > < / b > .   < / p > < p > < i n p u t   t y p e = ' s u b m i t '   n a m e = ' b L o g o u t '   v a l u e = ' L o g o u t ' > < / p > < f o r m > " ;  
         	 }  
         	 c a t c h ( E x c e p t i o n   e )  
         	 {  
         	 	 r e t u r n   " " ;  
         	 }  
         }  
          
         p r i v a t e   s t a t i c   v o i d   P r i n t L o g o u t P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n  
         {  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 1 6 b e " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   M e n u < / t i t l e > < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > " ) ;  
                 o u t . p r i n t l n ( " a   { t e x t - d e c o r a t i o n : n o n e ; } " ) ;  
                 o u t . p r i n t l n ( " a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } " ) ;  
                 o u t . p r i n t l n ( " < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g h = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > Y o u   a r e   s u c c e s s f u l l y   l o g g e d   o u t   f r o m   t h e   H e l a b a s a   A d m i n   C o n s o l e . < / h 3 > " ) ;  
  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f L o g o u t O K '   a c t i o n = . / i n d e x . h t m l   a l i g n = ' c e n t e r '   m e t h o d = ' p o s t ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                  
                 o u t . p r i n t l n ( " < i n p u t   t y p e = ' s u b m i t '   v a l u e = ' O k '   s t y l e = ' h e i g h t :   2 e m ;   w i d t h :   4 e m ' > " ) ;                  
                  
                 o u t . p r i n t l n ( " < / p > < / f o r m > " ) ;  
  
                 / / / / / / / / /                  
 / /                 o u t . p r i n t l n ( " < h 2 > < c e n t e r > " ) ;  
 / /                 o u t . p r i n t l n ( " S e r v e r   P r o p e r t i e s < / c e n t e r > < / h 2 > " ) ;  
 / /                 o u t . p r i n t l n ( " < b r > " ) ;  
 / /  
 / /                 o u t . p r i n t l n ( " < c e n t e r > < t a b l e > " ) ;  
 / /  
 / /                 j a v a . u t i l . P r o p e r t i e s   p r o p s   =   S y s t e m . g e t P r o p e r t i e s ( ) ;  
 / /                 j a v a . u t i l . E n u m e r a t i o n   e   =   p r o p s . p r o p e r t y N a m e s ( ) ;  
 / /  
 / /                 w h i l e   ( e . h a s M o r e E l e m e n t s ( ) )   {  
 / /                     S t r i n g   n a m e   =   ( S t r i n g )   e . n e x t E l e m e n t ( ) ;  
 / /                     o u t . p r i n t l n ( " < t r > " ) ;  
 / /                     o u t . p r i n t l n ( " < t d > "   +   n a m e   +   " < / t d > " ) ;  
 / /                     o u t . p r i n t l n ( " < t d > "   +   p r o p s . g e t P r o p e r t y ( n a m e )   +   " < / t d > " ) ;  
 / /                     o u t . p r i n t l n ( " < / t r > " ) ;  
 / /                 }  
 / /                 o u t . p r i n t l n ( " < / t a b l e > < / c e n t e r > " ) ;  
 / /                 / / / / / / /  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' >   r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;         	  
         } 	          
 }  
