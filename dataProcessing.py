import sqlite3

def quicksort(arr):
    
    pass

def search_books(keyword, db_path="library_db.sqlite"):
    conn = sqlite3.connect(db_path)
    cursor = conn.cursor()
    query = f"SELECT * FROM books WHERE title LIKE '%{keyword}%'"
    cursor.execute(query)
    results = cursor.fetchall()
    conn.close()
    return results
