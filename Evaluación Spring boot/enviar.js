$(document).ready(function(){
    $('#listar').on('click',function(){
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '';
        tabla.innerHTML += '<thead> <th>Codigo</th><th>Nombres</th><th>Apellidos</th><th>Materias</th><th>Notas</th> </thead>';

        $.ajax({
            url: "http://localhost:8080/ListarEstudiante",
            type: "GET",
            dataType:"JSON",
            success:function(respuesta) {
                console.log(respuesta);
                for (i = 0; i <= respuesta.length; i++){
                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigo + '</td><td>' +
                    respuesta[i].nombre + '</td><td>' +
                    respuesta[i].apellido + '</td><td>' +
                    respuesta[i].materia + '</td><td>' +
                    respuesta[i].notas + '</td></tr>' 
                }
                
            }

        })
    });


    $('#enviar').on('click',function(){
        let datos = {
            codigo: parseInt($('#codigo').val()),
            nombre: $('#nombre').val(),
            apellido: $('#apellido').val(),
            materia: materia = [$('#materia1').val(), $('#materia2').val(), $('#materia3').val()],
            notas: notas = [parseFloat($('#nota1').val()), parseFloat($('#nota2').val()), parseFloat($('#nota3').val())],
        }
        console.log(datos);
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "http://localhost:8080/AgregarEstudiante",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
            success: function(respuesta) {
                alert(respuesta);
            }
        })
    });


    $('#actualizar').on('click', function() {
        
        let datos = {
            notas: [parseFloat($('#nota1').val()), parseFloat($('#nota2').val()), parseFloat($('#nota3').val())],
        }

        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "http://localhost:8080/actualizarNotas",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
        })
    });


    $('#notaMa').on('click', function() {

        $.ajax({
            url: "http://localhost:8080/notaMayor",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
            success: function(respuesta) {
                $('#materia').text("La nota más alta es: "+ respuesta.notas + "en las materia "+ respuesta.materia);
            }
        })
    });


    $('#notaMe').on('click', function() {

        $.ajax({
            url: "http://localhost:8080/notaMenor",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
            success: function(respuesta) {
                $('#materia').text("La nota más bajita es: "+ respuesta.notas + "en las materia "+ respuesta.materia);
            }
        })
    });

});
