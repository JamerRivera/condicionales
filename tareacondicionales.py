nombre=input("ingrese su nombre:")
apellido=input("inprese su apellido:")
edad=int(input("ingrese su edad:"))
sexo=int(input("ingrese su sexo 1.masculino 2.femenino:"))

if sexo==1:
    print(f"es hombre")
else:
    print(f"es mujer")    


if edad>=18:
    print(f"es mayor de edad")
else:
    print(f"es menor de edad")
    
