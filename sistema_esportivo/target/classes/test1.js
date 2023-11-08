// Define the URL of the REST API you want to request
// Pesquisa o historico de todos os jogos da copa de 2022
// BTW recomendo usar o postman, alguns requests bugam quando usamos aqui n sei pq!
const apiUrl = 'http://livescore-api.com/api-client/scores/history.json?key=ILHc6lLwJGDvNgvn&secret=iATp9rDeujFXzLghwYuCkf93WMyJ337m&from=2022-01-01&to=2022-12-31&competition_id=362';

// Make a GET request
fetch(apiUrl)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json(); // Parse the response body as JSON
  })
  .then(data => {
    // Use the data from the response
    console.log(data);
  })
  .catch(error => {
    console.error('There was a problem with the fetch operation:', error);
  });
