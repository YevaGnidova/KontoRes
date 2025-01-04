class SelectionSort:
    def __init__(self, size):
        self.array = [0] * size

    def read_array(self):
        print("Enter 10 integers:")
        for i in range(len(self.array)):
            self.array[i] = int(input())

    def find_max_index(self, start):
        max_index = start
        for i in range(start + 1, len(self.array)):
            if self.array[i] > self.array[max_index]:
                max_index = i
        return max_index

    def sort_descending(self):
        for i in range(len(self.array) - 1):
            max_index = self.find_max_index(i)
            self.array[i], self.array[max_index] = self.array[max_index], self.array[i]

    def print_array(self):
        print("Sorted array in descending order:", self.array)

if __name__ == "__main__":
    sorter = SelectionSort(10)
    sorter.read_array()
    sorter.sort_descending()
    sorter.print_array()