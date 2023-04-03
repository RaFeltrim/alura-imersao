Nesse projeto foi desenvolvido com API do imdb, pegamos os top 250 filmes do imdb, tratamos eles e exibimos as informações na tela. Após isso foi pegamos a imagem da capa atraves de URL e geramos uma nova imagem atraves da nota que cada filme teve

Contem 4 classes
classe JsonParser-> para pegar os dados html da api e formatar eles em indetificadores e valores.

classe manipulaArquivo-> para ler o link do arquivo que foi salvo de forma externa em um txt que acompanha a aplicação.

classe GeradoraDeFigurinhas-> para receber um InputStream da imagem de capa e também a nota do filme, com isso é feito um tratamento para incluir um texto e foto a partir da nota do filme

classe app (main) onde é chamado os metodos para conexão com o HTTP, exibição dos dados na tela e gerando as imagens.

<div align = "center">
<img src = "https://user-images.githubusercontent.com/61166867/228916937-c1996652-e6db-4f9f-8173-d3ea0c63ff63.png" width= "500px" />
</div>



<div align = "left">
<img src = "https://user-images.githubusercontent.com/61166867/228925474-426261fd-fc46-4745-afca-df266080f560.png" width= "500px" />
</div>

<div align = "left">
<img src = "https://user-images.githubusercontent.com/61166867/228925537-83044e15-6bc2-4edd-a5b5-391f6773c1a2.png" width= "500px" />
</div>