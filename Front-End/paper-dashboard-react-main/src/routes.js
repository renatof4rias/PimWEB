import Notas from "views/Notas.js";
import Login from "views/Login.js";

var routes = [
  // {
  //   path: "/Clientes",
  //   name: "Clientes",
  //   icon: "nc-icon nc-single-02",
  //   component: Clientes,
  //   layout: "/admin"
  // },
  // {
  //   path: "/Equipamentos",
  //   name: "Equipamentos",
  //   icon: "nc-icon nc-settings",
  //   component: Equipamentos,
  //   layout: "/admin"
  // },
  // {
  //   path: "/Ordem-Servico",
  //   name: "Ordem de Serviço",
  //   icon: "nc-icon nc-single-copy-04",
  //   component: Orcamento,
  //   layout: "/admin"
  // },
  // {
  //   path: "/Ordem-Servico-Imprimir/:id?",
  //   component: OrcamentoImprimir,
  //   layout: "/admin"
  // }

  {
    path: "/Notas",
    name: "Dados do Aluno",
    icon: "nc-icon nc-single-02",
    component: Notas,
    layout: "/admin"
  },
  {
    path: "/Login",
    component: Login,
    layout: "/admin"
  }

];
export default routes;
