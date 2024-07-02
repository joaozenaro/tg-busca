# TG Aplicações Busca

## Como abrir o projeto

### Codespaces

1. Abrir o container  
No GitHub

$$
<\ > \text{Code} \longrightarrow Codespaces \longrightarrow \text{Create codespace on main} 
$$

### Linux + Docker
1. Clonar o repo
```console
git clone git@github.com:joaozenaro/tg-busca.git
ou
git clone https://github.com/joaozenaro/tg-busca.git
```

2. Abrir o projeto
```console
code tg-busca/
```

3. Abrir o container

$$
QuickSearch (ctrl + shift + p) \longrightarrow \text{Dev Containers: Rebuild and Reopen in Container}
$$ 

### Ambos

1. Abrir a workspace **dentro do container**
$$QuickSearch (ctrl + shift + p) \longrightarrow \text{File: Open Workspace from File}$$
Endereço da workspace: `/workspaces/tg-busca/.code-workspace`

> Para adicionar novos projetos é necessario adicionar um novo `path` em `folders` no arquivo `.code-workspace`.

## Como rodar o projeto
Caso não apareçam anotações acima dos metodos `main`. No canto superior direito pressione o botão $\vartriangleright \text{Run Java}$

### Pressione `Run` acima do metodo main de algum dos projetos.
> Com essa configuração, cada projeto tem seu namespace proprio.
