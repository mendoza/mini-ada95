procedure Hello is
a: Integer := 10;
b: Float := 20.0;
c: Boolean := True;
d: Float := a-b;
begin
    while (a < b) loop
        Put(a);
    end loop;
    
    for z in 1..10 loop
        Put_Line(z);
    end loop;

    if (a < b and a  < b or a > c) then
        Put(a);
    elsif (a > c) then
         Put_Line(a);
    elsif (a < b) then
         Put_Line(b);
    else
        Get(a);
    end if;

end Hello;
