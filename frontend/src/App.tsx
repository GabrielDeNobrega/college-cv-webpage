import {
  Routes,
  Route
} from "react-router-dom";
import MainPage from "pages/main-page";

function App() {
  return (

    <Routes>
      <Route path="users/:id" element={<MainPage />} />
    </Routes>

  );
}

export default App;