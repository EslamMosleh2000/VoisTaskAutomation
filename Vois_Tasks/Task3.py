import pandas as pd

value_of_dollar = 48
df = pd.read_csv('Employees.csv')
df_new = df.drop_duplicates()
df_new['Age'] = df_new['Age'].astype(int)
df_new['Salary(EGP)'] = df_new['Salary(USD)'] * value_of_dollar
df_new = df_new.drop(columns=['Salary(USD)'])

average_age = df_new['Age'].mean()
median_salary = df_new['Salary(EGP)'].median()

gender_counts = df_new['Gender'].value_counts()
ratio_males_females = gender_counts.get('M') / gender_counts.get('F')
df_new.to_csv('Output.csv', index=0)


print(average_age)
print(median_salary)
print(ratio_males_females)
