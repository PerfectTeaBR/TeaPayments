
# 🍵 TeaPayments

## ☕ Simulador Open Source de Compras Digitais em Flask  
### 🛒 Produtos, Carrinho e Navegação — Sem Pagamento Real, Sem API (por enquanto)

**TeaPayments** é um sistema de exemplo feito com **Flask (Python)** para simular compras de produtos digitais, como stickers, wallpapers, logos, templates e comissões artísticas.  

⚠️ **Importante:**  
- Este projeto **não realiza pagamentos reais**  
- **Não possui API** (por enquanto)  
- **Não permite alterações no código original**  

✅ Este projeto é **Open Source** para estudo e referência, mas não deve ser modificado para distribuição.

---

## 🧩 Estrutura do Projeto

```

TeaPayments/
│
├── main.py               # Arquivo principal do Flask
└── templates/           # Páginas HTML
 ├── index.html
 ├── produtos.html
 └── carrinho.html

````

---

## 🚀 Funcionalidades

- Página inicial com tela de entrada  
- Seção de seleção de produtos  
- Simulação de adição de itens ao carrinho  
- Página de carrinho simples para visualização  
- Interface leve e intuitiva feita em HTML e CSS  

---

## ⚙️ Requisitos e Linguagens

**Linguagens:**  
- Python 3.8+  
- HTML  
- CSS  

**Bibliotecas / Dependências:**  
- Flask  

Instale o Flask com:

```bash
pip install flask
````

---

## 💻 Como Executar o Projeto

1. Acesse a pasta do projeto no terminal.
2. Execute o servidor Flask:

```bash
python app.py
```

3. Abra o navegador e acesse:

```
http://127.0.0.1:5000/
```

---

## 📄 Rotas

| Rota            | Descrição                                  |
| --------------- | ------------------------------------------ |
| `/`             | Página inicial (entrada / login)           |
| `/produtos`     | Página de seleção de produtos              |
| `/carrinho`     | Exibe os itens simulados no carrinho       |
| `/registro`     | Página de registro (simulação)             |
| `/compracerta`  | Página de confirmação de compra (simulada) |
| `/compraerrada` | Página de erro de compra (simulada)        |

---

## 🧠 Possíveis Extensões Futuras

* Transformar algumas rotas em **API real** para manipulação do carrinho(Daqui alguns anos)
* Sistema real de login e registro com banco de dados
* Persistência de carrinho usando banco de dados
* Interface visual aprimorada (CSS moderno ou Tailwind)
* Integração opcional de API de pagamento real

---

## 🧾 Licença

Este projeto é licenciado sob a **GNU Affero General Public License v3.0 (AGPL-3.0)**(Esqueci de Colocar a Licença).
Você pode usar e estudar o projeto, mas **não é permitido alterar ou redistribuir o código.


