import axios from "axios";

const httpClient = axios.create({
    baseURL: "http://localhost:8080/"
});

class ApiService {

    constructor(apiUrl) {
        this.apiUrl = apiUrl;
    }

    get(url) {
        return httpClient.get(this.apiUrl + url);
    }

    post(url, data) {
        return httpClient.post(this.apiUrl + url, data);
    }

    put(url, data) {
        return httpClient.put(this.apiUrl + url, data);
    }

    delete(url) {
        return httpClient.delete(this.apiUrl + url);
    }
}

export default ApiService;