class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        # ans list
        res = []

        for num in range(1, n+1):

            divisible_by_3 = (num % 3 == 0)
            divisible_by_5 = (num % 5 == 0)

            num_res_str = ""

            if divisible_by_3:
                # Divides by 3
                num_res_str += "Fizz"
            if divisible_by_5:
                # Divides by 5
                num_res_str += "Buzz"
            if not num_res_str:
                # Not divisible by 3 or 5
                num_res_str = str(num)

            # Append the current answer str to the ans list
            res.append(num_res_str)

        return res
