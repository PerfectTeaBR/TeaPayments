from flask import Flask, render_template

# Configuração para as Rotas do Flask
app = Flask(__name__)

# Rotas
@app.route("/")
def homepage():
  return render_template ("index.html")

@app.route("/carrinho")
def carrinho():
  return render_template ("carrinho.html")

@app.route("/produtos")
def produtos():
  return render_template ("produtos.html")

# Erro 404 - Page not Found
@app.route("/tea-payments/404-error")
def error():
  return render_template ("404.html")

@app.route("/compracerta")
def compracerta():
  return render_template ("compracerta.html")

@app.route("/compraerrada")
def compraerrada():
  return render_template ("compraerrada.html")

@app.route("/registro")
def registro():
  return render_template ("registro.html")

# Config. para as rotas funcionar, e com debugger
if __name__ == "__main__":
  app.run(debug=True)