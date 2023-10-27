@echo off
echo Script de Inicialização do sistema
cd "../Starters"
start "" BancodeDados.bat
timeout 20
start "" BackEnd.bat
start "" FrontEnd.bat
