from app.app import app  # 從 app.py 中導入 Flask 應用程式實例

if __name__ == '__main__':
    app.run(debug=True)  # 啟動 Flask 開發伺服器