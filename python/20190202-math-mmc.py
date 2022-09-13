# Python 3.7
# Thanks JetBrains PyCharm
# Created by Towlen/Sannis
# mymmc = mmc(2, 6, 7)

# NOTE:For now using only 10 prime elements

def mmc(*args):
    pos_algorithm, max_num_mmc, state_calc, current_partition, MMC_calc, num_store_mmc = 0, 0, 0, 0, 1, []
    list_prime_num, get_split = [2,3,5,7,11,13,17,19,23,29], False
    for argx in args:
        num_store_mmc.append(argx)
        max_num_mmc += 1
        
    while pos_algorithm < max_num_mmc:

        if num_store_mmc[pos_algorithm] % list_prime_num[current_partition] == 0:
            num_store_mmc[pos_algorithm] = num_store_mmc[pos_algorithm] / list_prime_num[current_partition]
            if num_store_mmc[pos_algorithm] == 1:
                state_calc += 1
            if get_split == False:
                MMC_calc = MMC_calc * list_prime_num[current_partition]
                get_split = True

        if pos_algorithm + 1 == max_num_mmc:
            if state_calc == max_num_mmc:
                return MMC_calc
            elif get_split == False:
                current_partition += 1
            else:
                get_split = False
                current_partition = 0
            pos_algorithm = 0
            continue

        pos_algorithm += 1
    return 1
