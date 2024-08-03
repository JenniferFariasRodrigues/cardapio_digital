import './App.css'
import { Card } from './components/card/card';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const { data } = useFoodData();
  return (
    <div className="container" content="width=device-width, initial-scale=1.0">
      <h1>Cardápio</h1>
      <div className="card-grid">
        {data?.map(foodData =>
          <Card
            price={foodData.price}
            title={foodData.title}
            image={foodData.image}
          />)}
      </div>
    </div>
  )
}

export default App
