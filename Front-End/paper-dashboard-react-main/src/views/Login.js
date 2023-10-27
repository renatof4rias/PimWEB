import React from "react";
import LoginService from "../services/LoginService";


class Login extends React.Component {
  constructor(props) {
    super(props);
    this.loginService = new LoginService();
    this.state = {
      username: "",
      password: "",
      message: "",
      loading: false
    };
  }

  componentDidMount() {
    document.body.classList.toggle("login-page");
  }

  componentWillUnmount() {
    document.body.classList.toggle("login-page");
  }

  onChangeUsername = (event) => {
    this.setState({
      username: event.target.value,
    });
  }

  onChangePassword = (event) => {
    this.setState({
      password: event.target.value,
    });
  }

  handleLogin = (event) => {
    event.preventDefault();
    this.setState({
      message: "",
      loading: true
    });
    //this.loginService.login(this.state.username, this.state.password)
    localStorage.setItem("nomeAluno", this.state.username)
    this.props.history.push("/admin/Notas");
    window.location.reload();
    //   .then(() => {
    //     this.props.history.push("/admin/Clientes");
    //     window.location.reload();
    //   })
    //   .catch((error) => {
    //     console.log(error);
    //     this.setState({
    //       loading: false,
    //       message: "Usuário ou senha inválidos"
    //     });
    //   });
  }

  render() {
    return (
      <>
        <div className="content">
          <div className="container-fluid">
            <div className="row">
              <div className="col-md-4 offset-md-4">
                <div className="card card-user">
                  <div className="card-header">
                    <h5 className="card-title text-center">Login</h5>
                  </div>
                  <div className="card-body">
                    <form onSubmit={this.handleLogin}>
                      <div className="form-group">
                        <label>Usuário</label>
                        <input type="text" className="form-control" placeholder="Usuário" value={this.state.username} onChange={this.onChangeUsername} />
                      </div>
                      <div className="form-group">
                        <label>Senha</label>
                        <input type="password" className="form-control" placeholder="Senha" value={this.state.password} onChange={this.onChangePassword} />
                      </div>
                      <div className="form-group">
                        <button type="submit" className="btn btn-primary btn-block" disabled={this.state.loading}>
                          {this.state.loading && (
                            <span className="spinner-border spinner-border-sm"></span>
                          )}
                          <span>Login</span>
                        </button>
                      </div>
                      {this.state.message && (
                        <div className="form-group">
                          <div className="alert alert-danger" role="alert">
                            {this.state.message}
                            </div>
                        </div>
                        )}
                    </form>
                    </div>
                    </div>
                    </div>
                    </div>
                    </div>
                    </div>
                    </>
                    );
                    }
                    }

export default Login;
    