const { default: ApiService } = require("./ApiService");

class AlunoInfoService extends ApiService{
    constructor(){
        super("/api/aluno")
      }
    
    
      async getInfosAlunoByNome(nomeAluno){
        let url = `/detalhes?nomeAluno=${nomeAluno}`
        return await this.get(url)
      }
}

export default AlunoInfoService;