// jQuery(...) se abrevia como $(...)
jQuery(document).ready(function () {

    jQuery("section").append("<div><p>LEYENDA DE LO QUE SEA</p></div>");
    $(".articulo").append("<p>UN PARRAFO EN CADA ELEM con class = 'articulo'</p>");

    $("tr").append("<td>Info</td>");    // Añadir quinta col
    // tr.setAttribute("style", "background-color: red");
    $("td:nth-child(5)").attr("style", "background-color: red; color: white");
    $("td:nth-child(5)").click(() => {
        alert('un click desde jQ');
    });
    $("otro_menu").html("<h2>Menú de artículos</h2/<br/><br/>");

    //$("article").$("#otro_menu").append("<a href='' class=''></a>");

    // Hecho por mi
    $("article").each(function (index) {
        let idArticulo = "articulo_123pepe_" + index
        $(this).attr("id", idArticulo);
        $("#otro_menu").append(" <a href='#" + idArticulo
            + "' class='enlace-articulo'>Articulo nº " + index + "</a> ");
    });

    $(".enlace-articulo").each(function (index) {
        $(this).click(function () {
            $("#articulo_123pepe_" + index).toggle(3000);
        })
    });
    //Hecho por profesor
    /*$("article,section> section").each(function (index) {
        let idArticulo = "articulo_123pepe_" + index;
        $(this).slideUp();
        $(this).attr("id", idArticulo);
        $("otro_menu").append(" <a id='enlace'_ " + idArticulo + "' "
            + "`class='enlace-articulo'>Articulo nº " + index + "</a> ");
        $("#enlace_" + idArticulo).click(function () {
            if (typeof (articuloActivo) === "undefined") {
                $("#" + idArticulo).slideDown(1500);
            } else {
                $(articuloActivo).slideUp(800, function () {
                    $("#" + idArticulo).slideDown(1500);
                });
            }
            articuloActivo = $("#" + idArticulo);
        })
    });*/

});
