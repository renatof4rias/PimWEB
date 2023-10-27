import React from "react";

// reactstrap components
import {
  Card,
  CardHeader,
  CardBody,
  CardTitle,
  Row,
  Col,
  FormGroup,
  Input,
  Form,
  CardFooter} from "reactstrap";

import "../css/InfosAluno.css"
import AlunoInfoService from "../services/AlunoInfoService";

class Notas extends React.Component {

  state = {
    id : "",
    nomealuno : "",
    cpfaluno : "",
    rgaluno : "",
    fonealuno : "",
    emailaluno : "",
    cepaluno : "",
    endaluno : "",
    idturma : "",
    idcurso : "",
    disciplinas : [
      {
        id : "",
        nome : "",
        descricao : "",
        notas : [
          {
            idAluno : "",
            idcurso : "",
            np1 : "",
            np2 : "",
            trabalho : "",
          }
        ],
        frequencias : [
          {
            aula1 : "",
            aula2 : "",
            aula3 : "",
            aula4 : "",
            aula5 : "",
            aula6 : "",
            aula7 : "",
            aula8 : "",
            aula9 : "",
            aula10 : "",
            idAluno : "",
            idcurso : "",
          }
        ]
      }
    ]
  }

  constructor() {
    super();
    this.alunoInfoService = new AlunoInfoService();
  }
    handleChange = (event) => {
    const target = event.target;
    const value = target.value;
    const name = target.name;

    this.setState({
      [name]: value
    });
  }


  componentDidMount() {
    this.alunoInfoService.getInfosAlunoByNome(localStorage.getItem("nomeAluno")).then((resposta) => {
      this.setState({
        id : resposta.data.aluno.id,
        nomealuno : resposta.data.aluno.nomealuno,
        cpfaluno : resposta.data.aluno.cpfaluno,
        rgaluno : resposta.data.aluno.rgaluno,
        fonealuno : resposta.data.aluno.fonealuno,
        emailaluno : resposta.data.aluno.emailaluno,
        cepaluno : resposta.data.aluno.cepaluno,
        endaluno : resposta.data.aluno.endaluno,
        idturma : resposta.data.aluno.idturma,
        idcurso : resposta.data.aluno.idcurso,
        disciplinas : resposta.data.disciplinas,

      }) 
    }
    ).catch((erro) => {
      console.log(erro)
    })
  }

  render() {
    return this.mostrarTelaDadosAluno()
  }


  mostrarTelaDadosAluno = () => {
    return (
      <>
        <div className="content">
          <Row>
            <Col md="12">
              <Card className="card-user">
                <CardHeader>
                  <CardTitle tag="h5">Dados do Aluno</CardTitle>
                </CardHeader>
                <CardBody>
                  <Form>
                    <Row>
                      <Col md="4">
                        <FormGroup>
                          <label>Nome</label>
                          <Input
                            disabled = {true}
                            id="nomealuno"
                            name="nomealuno"
                            value={this.state.nomealuno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col md="4">
                        <FormGroup>
                          <label>CPF</label>
                          <Input
                            disabled = {true}
                            id="cpfaluno"
                            name="cpfaluno"
                            value={this.state.cpfaluno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col md="4">
                        <FormGroup>
                          <label>RG</label>
                          <Input
                            disabled = {true}
                            id="rgaluno"
                            name="rgaluno"
                            value={this.state.rgaluno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col md="4">
                        <FormGroup>
                          <label>Telefone</label>
                          <Input
                            disabled = {true}
                            id="fonealuno"
                            name="fonealuno"
                            value={this.state.fonealuno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col md="4">
                        <FormGroup>
                          <label>Email</label>
                          <Input
                            disabled = {true}
                            id="emailaluno" 
                            name="emailaluno"
                            value={this.state.emailaluno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                      <Col md="4">
                        <FormGroup>
                          <label>CEP</label>
                          <Input
                            disabled = {true}
                            id="cepaluno"
                            name="cepaluno"
                            value={this.state.cepaluno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col md="12">
                        <FormGroup>
                          <label>Endereço</label>
                          <Input
                            disabled = {true}
                            id="endaluno"
                            name="endaluno"
                            value={this.state.endaluno}
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                    <Row>
                      <Col md="12">
                        <FormGroup>
                          <label>Turma</label>
                          <Input
                            disabled = {true}
                            id="idcurso"
                            name="idcurso"
                            value="DS4P30"
                            type="text"
                          />
                        </FormGroup>
                      </Col>
                    </Row>
                    <br></br>
                    <Row>
                      <Col md="12">
                        <h1>Notas e Frequências</h1>
                      </Col>
                    </Row>
                  </Form>
                  {this.state.disciplinas.map((disciplina) => {
                    return (
                      <Card>
                        <CardHeader>
                          <CardTitle tag="h2" className="tituloNomeDisciplina">{disciplina.nome}</CardTitle>
                        </CardHeader>
                        <CardBody>
                          <table className="table">
                            <thead>
                              <tr>
                                <th scope="col">NP1</th>
                                <th scope="col">NP2</th>
                                <th scope="col">Trabalho</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>{disciplina?.notas?.np1 == null ? "Nota nao Lancada" : disciplina.notas.np1}</td>
                                <td>{disciplina?.notas?.np2 == null ? "Nota nao Lancada" : disciplina.notas.np2}</td>
                                <td>{disciplina?.notas?.trabalho == null ? "Nota nao Lancada" : disciplina.notas.trabalho}</td>
                              </tr>
                            </tbody>
                          </table>
                          </CardBody>
                          <CardFooter>
                          <table className="table">
                            <thead>
                              <tr>
                                <th scope="col">Aula 1</th>
                                <th scope="col">Aula 2</th>
                                <th scope="col">Aula 3</th>
                                <th scope="col">Aula 4</th>
                                <th scope="col">Aula 5</th>
                                <th scope="col">Aula 6</th>
                                <th scope="col">Aula 7</th>
                                <th scope="col">Aula 8</th>
                                <th scope="col">Aula 9</th>
                                <th scope="col">Aula 10</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>{disciplina?.frequencia?.aula1 == null ? "🔵" : disciplina.frequencia.aula1 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula2 == null ? "🔵" : disciplina.frequencia.aula2 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula3 == null ? "🔵" : disciplina.frequencia.aula3 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula4 == null ? "🔵" : disciplina.frequencia.aula4 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula5 == null ? "🔵" : disciplina.frequencia.aula5 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula6 == null ? "🔵" : disciplina.frequencia.aula6 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula7 == null ? "🔵" : disciplina.frequencia.aula7 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula8 == null ? "🔵" : disciplina.frequencia.aula8 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula9 == null ? "🔵" : disciplina.frequencia.aula9 === "Presença" ? "🟢" : "🔴"}</td>
                                <td>{disciplina?.frequencia?.aula10 == null ? "🔵" : disciplina.frequencia.aula10 === "Presença" ? "🟢" : "🔴"}</td>
                              </tr>
                            </tbody>
                          </table>
                          </CardFooter>
                      </Card>
                    )
                  })}
                </CardBody>
              </Card>
            </Col>
          </Row>
        </div>
      </>
    );
  }
}

export default Notas;