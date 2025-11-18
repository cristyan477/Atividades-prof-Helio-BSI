import pandas as pd

arquivo = "caixa.csv"
df = pd.read_csv(arquivo)

pd.set_option('display.max_columns', None)
pd.set_option('display.width', None)

df = df.dropna()
df = df[df['Quantidade'].apply(lambda x: (x % 1) == 0)]




grande_total = df['Total_Venda'].sum()


print(df)

# Exibir total geral separadamente
print(f"\nGrande Total Geral: R$ {grande_total:.2f}")