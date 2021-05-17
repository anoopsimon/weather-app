public class Test {public static String data =

       "<!DOCTYPE html>\n" +
               "<html lang=\"en-US\">\n" +
               "<body>\n" +
               "\n" +
               "<h1>Daily Weather Report Status:</h1>\n" +
               "\n" +
               "<div id=\"piechart\"></div>\n" +
               "\n" +
               "<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n" +
               "\n" +
               "<script type=\"text/javascript\">\n" +
               "// Load google charts\n" +
               "google.charts.load('current', {'packages':['corechart']});\n" +
               "google.charts.setOnLoadCallback(drawChart);\n" +
               "\n" +
               "// Draw the chart and set the chart values\n" +
               "function drawChart() {\n" +
               "  var data = google.visualization.arrayToDataTable([\n" +
               "  ['Task', 'Hours per Day'],\n" +
               "  ['Work', 8],\n" +
               "  ['Eat', 2],\n" +
               "  ['TV', 4],\n" +
               "  ['Gym', 2],\n" +
               "  ['Sleep', 8]\n" +
               "]);\n" +
               "\n" +
               "  // Optional; add a title and set the width and height of the chart\n" +
               "  var options = {'title':'My Average Day', 'width':550, 'height':400};\n" +
               "\n" +
               "  // Display the chart inside the <div> element with id=\"piechart\"\n" +
               "  var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n" +
               "  chart.draw(data, options);\n" +
               "}\n" +
               "</script>\n" +
               "\n" +
               "<head>\n" +
               "<style>\n" +
               "table {\n" +
               "  font-family: arial, sans-serif;\n" +
               "  border-collapse: collapse;\n" +
               "  width: 80%;margin:auto\n" +
               "}\n" +
               "\n" +
               "td, th {\n" +
               "  border: 1px solid #dddddd;\n" +
               "  text-align: left;\n" +
               "  padding: 8px;\n" +
               "}\n" +
               "\n" +
               "tr:nth-child(even) {\n" +
               "  background-color: #dddddd;\n" +
               "}\n" +
               "</style>\n" +
               "</head>\n" +
               "<body>\n" +
               "\n" +
               "<h2>Weather By State</h2>\n" +
               "\n" +
               "<table>\n" +
               "  <tr>\n" +
               "    <th>Company</th>\n" +
               "    <th>Contact</th>\n" +
               "    <th>Country</th>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td>Alfreds Futterkiste</td>\n" +
               "    <td>Maria Anders</td>\n" +
               "    <td>Germany</td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td>Centro comercial Moctezuma</td>\n" +
               "    <td>Francisco Chang</td>\n" +
               "    <td>Mexico</td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td>Ernst Handel</td>\n" +
               "    <td>Roland Mendel</td>\n" +
               "    <td>Austria</td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td>Island Trading</td>\n" +
               "    <td>Helen Bennett</td>\n" +
               "    <td>UK</td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td>Laughing Bacchus Winecellars</td>\n" +
               "    <td>Yoshi Tannamuri</td>\n" +
               "    <td>Canada</td>\n" +
               "  </tr>\n" +
               "  <tr>\n" +
               "    <td>Magazzini Alimentari Riuniti</td>\n" +
               "    <td>Giovanni Rovelli</td>\n" +
               "    <td>Italy</td>\n" +
               "  </tr>\n" +
               "</table>\n" +
               "\n" +
               "</body>\n" +
               "</html>\n";
}
