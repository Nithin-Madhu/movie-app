import logo from './logo.svg';
import './App.css';
import api from './api/axiosConfig'    //1
import { useState , useEffect} from 'react'; //2

function App() {

  //  3 return destructured array from useState hook
  const [movies, setMovies] = useState();
  // 4 function used to change state
  const getMovies = async() => {

    try{
      const response = await api.get("api/v1/movies");
      console.log(response.data);
      setMovies(response.data);
    }catch(err){
      console.log(err);
    }
  }
// 5
    useEffect(() => {
      getMovies();
    },[])
  return (
    <div className="App">
     
    </div>
  );
}

export default App;
