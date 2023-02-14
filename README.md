# lab1s
using System;

namespace task2
{
    internal class Program
    {
        
        
        static double Exp(double x, double precision = 1e-10)
        {
            var result = 0d;
            var current = 1d;
            var factorial = 1d;
            var power = 1d;
            var n = 1;
            while (Math.Abs(current) > precision)
            {
                current = power  / factorial;
                result += current;
                power *= x;
                factorial *= n;
                n++;
            }

            return result;
        }
        public static void Main(string[] args)
        {
            Console.Write("x = ");
            var x = double.Parse(Console.ReadLine());
            var result = Exp(x);
            Console.WriteLine("Exp(x)      = {0}", result);
            Console.WriteLine("Math.Exp(x) = {0}", Math.Exp(x));
            Console.ReadKey(true);   
        }
    }
}
