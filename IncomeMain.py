# This program shows the top and bottom incomes in the USA by state
# from years 2014 to 2018

top5 = [["Washington, DC", "71648", "75628", "75506", "82372", "85203"],
        ["Maryland", "73971", "83242", "75847", "78945", "80776"],
        ["Hawaii", "71919", "72222", "76126", "80088", "81740"],
        ["New Jersey", "69592", "73486", "74511", "77765", "80212"],
        ["Massachusetts", "69160", "70628", "75297", "77385", "79835"]]

bottom5 = [["Louisiana", "44555", "45727", "45146", "46145", "47905"],
           ["New Mexico", "44803", "45382", "46748", "46744", "47169"],
           ["Kansas", "41262", "41995", "44334", "45869", "47062"],
           ["Mississippi", "39680", "40593", "41754", "43529", "44717"],
           ["West Virginia", "41059", "42019", "43385", "43469", "44097"]]


# Print a single line of a specified length and char type
def printlines(x, c):
    print(c * x)

# Determine the lowest average by state, income, and year
def lowest():
    # initialize everything before the loop starts
    lo = bottom5[0][1]
    state = bottom5[0][0]
    year = 2014
    lowave = ""

    for i in range(0, len(bottom5)):
        incr = 0
        for j in range(1, 5):
            # Check if income is lower than current assigned value
            if bottom5[i][j] < lo:
                lo = bottom5[i][j]
                state = bottom5[i][0]

                # increment the year
                if i > 1:
                    incr += 1
                    year += incr

        lowave = {
            "lowest Average": lo,
            "State": state,
            "Year": year
        }
    return lowave

# Determine the highest average by state, income, and year
def highest():
    # initialize everything before the loop starts
    hi = top5[0][1]
    state = top5[0][0]
    year = 2014
    highave = ""

    for i in range(0, len(top5)):
        incr = 0
        for j in range(1, 5):
            # Check if the income is higher than its current assigned value
            if top5[i][j] > hi:
                hi = top5[i][j]
                state = top5[i][0]

                # Increment the year
                if i > 1:
                    incr += 1
                    year += incr

        highave = {
            "Highest Average": hi,
            "State": state,
            "Year": year
        }
    return highave

printlines(60, '-')

printlines(60, '-')
print("Top 5 Median Income by State (Years 2014-2018)")
printlines(60, '-')

# Show all top 5 incomes
for i in top5:
    print(i),

printlines(60, '-')
print("Bottom 5 Median Income by State (Years 2014-2018)")
printlines(60, '-')

# Show all bottom 5 incomes
for i in bottom5:
    print(i),

printlines(60, '-')
print("Highest and Lowest Average Incomes")
printlines(60, '-')
print(lowest())
print(highest())
