import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // fazer uma conexão HTTP e buscar os top 250 filmes
        // String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json";
        String imdbKey = System.getenv("IMDB_API_KEY");
        String url = "https://raw.githubusercontent.com/" + imdbKey;
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        final HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // extrair só os dados que interessam (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        // exibir e manipular os dados 
        for (int i = 0; i < 3; i++) {
            Map<String, String> filme = listaDeFilmes.get(i);
            System.out.println("\u001b[1mTítulo:\u001b[m " + filme.get("title"));
            System.out.println("\u001b[1mURL Da Imagem: \u001b[m " +filme.get("image"));
            System.out.println(filme.get("imDbRating"));
            double classificação = Double.parseDouble(filme.get("imDbRating"));
            int numeroEstrelinhas = (int) classificação;
            for (int n = 1; n <= numeroEstrelinhas; n++) {
                System.out.print("⭐");

           }


           System.out.println("\n");
    }
}
}