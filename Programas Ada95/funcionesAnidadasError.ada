------ FUNCIONES ANIDADAS - ERROR

procedure Hello is
    a: Integer;
	-- Deberia tirar error por las declaraciones
    b; Float ;
    c, Boolean; 

	-- Deberia tirar error por falta de return 
    function uno(a,b:Integer)  Integer is
		
        function dos(a,b:in Integer) return Integer is
        
            begin
                Put(two);

                return a;

        end dos;

        begin
            Put(one);

            return b;

    end uno;

    begin

        b == 2.0; 
        c := True; 

end Hello;