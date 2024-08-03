import './App.css'
import { Card } from './components/card/card';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const { data } = useFoodData();
  return (
    <div className="container" >
      <h1 >Cardápio</h1>
      <div className="card-grid">
        {data?.map(foodData =>
          <Card
            key={foodData.title} // Adicione uma chave para ajudar na renderização
            price={foodData.price}
            title={foodData.title}
            image={foodData.image}
          // price={foodData.price}
          // title={foodData.title}
          // image={foodData.image}
          />)}
      </div>
    </div>
  )
}

export default App
