------ FUNCIONES ANIDADAS/ RECURSIVA/  IF / LOOP

procedure Hello is
    a: Integer;
    b: Float ;
    c: Boolean; 

    function dos(a,b:in Integer) return Integer is
	    function uno(a,b:in Integer) return Integer is
        		begin
            		Put(one);
				return uno(x, y);
    		end uno;
        begin
            Put(one);
		return; 
    end dos;

	function uno(a,b:in Integer) return Integer is
        		begin
            		Put(one);
				return True;
    		end uno;
    begin

        b := 2.0;
        c := True;

	loop 
		Put(a);
		exit when (a>2); 
	end loop; 

end Hello;