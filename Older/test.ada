procedure Hello is
a: Integer := 10;
begin
    b: Float := 20.0;
    f: Float := a-b;
    c: Boolean := True;
    while (a < b) loop
        Put(a);
    end loop;

    if (a < b and a  < b or a > c) then
        Put(a);
    elsif (a > c) then
         Put_Line(a);
    else
        Get(a);
    end if;

end Hello;
