
    #include <cuda.h>
    #include <stdio.h>
    #include <time.h>

    #define SIZE 5

    __global__ void max(int *a , int *c)
    {
    int i = threadIdx.x;

    *c = a[0];

            if(a[i] > *c)
                    {
                    *c = a[i];
                    }

    }

    int main()
    {
    int i;
    srand(time(NULL));

    int a[SIZE];
    int c;

    int *dev_a, *dev_c;

    cudaMalloc((void **) &dev_a, SIZE*sizeof(int));
    cudaMalloc((void **) &dev_c, SIZE*sizeof(int));

    for( i = 0 ; i < SIZE ; i++)
    {
    a[i] = rand()% 20 + 1;
    }
    for( i = 0 ; i < SIZE ; i++)
    {
    printf("%d ",a[i]);
    }

    cudaMemcpy(dev_a , a, SIZE*sizeof(int),cudaMemcpyHostToDevice);
    max<<<1,SIZE>>>(dev_a,dev_c);
    cudaMemcpy(&c, dev_c, SIZE*sizeof(int),cudaMemcpyDeviceToHost);

    printf(" max =  %d ",c);

   

    return 0;
    }
