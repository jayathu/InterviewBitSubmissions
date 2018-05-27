package com.company;

import com.company.HashTable.MinWindow;
import com.company.Strings.ReverseWords;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //MinWindow minWindow = new MinWindow();
        //String A = "0mJdGXwLm9AOZ5xA8u92KDYqGJroQ537hoRXjQoUCMOpDYwxoNjexJGWQJAIxSFF3ZbIe27oFxUTJxtv8mORwpuRZn30MDj3kXRW2Ix3lslj7kwmGZPXAKhBW4q5T2BzsqbL0ZETFqRdxVm8GCGfqshvpWzsRvprUcF9vw3VlftqTRzKRzr4zYB2P6C7lg3I7EhGMPukUj8XGGZTXqPqnCqes";
        //String B = "rsm2ty04PYPEOPYO5";

        //A = "xiEjBOGeHIMIlslpQIZ6jERaAVoHUc9Hrjlv7pQpUSY8oHqXoQYWWll8Pumov89wXDe0Qx6bEjsNJQAQ0A6K21Z0BrmM96FWEdRG69M9CYtdBOrDjzVGPf83UdP3kc4gK0uHVKcPN4HPdccm9Qd2VfmmOwYCYeva6BSG6NGqTt1aQw9BbkNsgAjvYzkVJPOYCnz7U4hBeGpcJkrnlTgNIGnluj6L6zPqKo5Ui75tC0jMojhEAlyFqDs7WMCG3dmSyVoan5tXI5uq1IxhAYZvRQVHtuHae0xxwCbRh6S7fCLKfXeSFITfKHnLdT65K36vGC7qOEyyT0Sm3Gwl2iXYSN2ELIoITfGW888GXaUNebAr3fnkuR6VwjcsPTldQSiohMkkps0MH1cBedtaKNoFm5HbH15kKok6aYEVsb6wOH2w096OwEyvtDBTQwoLN87JriLwgCBBavbOAiLwkGGySk8nO8dLHuUhk9q7f0rIjXCsQeAZ1dfFHvVLupPYekXzxtWHd84dARvv4Z5L1Z6j8ur2IXWWbum8lCi7aErEcq41WTo8dRlRykyLRSQxVH70rUTz81oJS3OuZwpI1ifBAmNXoTfznG2MXkLtFu4SMYC0bPHNctW7g5kZRwjSBKnGihTY6BQYItRwLUINApd1qZ8W4yVG9tnjx4WyKcDhK7Ieih7yNl68Qb4nXoQl079Vza3SZoKeWphKef1PedfQ6Hw2rv3DpfmtSkulxpSkd9ee8uTyTvyFlh9G1Xh8tNF8viKgsiuCZgLKva32fNfkvW7TJC654Wmz7tPMIske3RXgBdpPJd5BPpMpPGymdfIw53hnYBNg8NdWAImY3otYHjbl1rqiNQSHVPMbDDvDpwy01sKpEkcZ7R4SLCazPClvrx5oDyYolubdYKcvqtlcyks3UWm2z7kh4SHeiCPKerh83bX0m5xevbTqM2cXC9WxJLrS8q7XF1nh";
        //B = "dO4BRDaT1wd0YBhH88Afu7CI4fwAyXM8pGoGNsO1n8MFMRB7qugS9EPhCauVzj7h";
        //A = "w";
        //B = "o";
//        String t1 = "CEZcABNr3rbzGpr76enhArjhlsnhHfRWs9xTzmPQLZpaw9yMVYZgevrWoIKiuKj89LQHqFWkddRxuehQNh2HrPuDLJTmUZvCfErufmrjjkOd9FKUbY";
//        String t2 = "YlxR2XOumdC9B86v7SwhPGf9jLlBzVG4yWr528539Kme5CEZcABNr3rbzGpr76enhArjhlsnhHfRWs9xTzmPQLZpaw9yMVYZgevrWoIKiuKj89LQHq";
//        A = "gegQ0SyEf0mUUd5fj8dT2og0i6OAS23iH2KcUkgFJznx99BUxlRZwRYlxR2XOumdC9B86v7SwhPGf9jLlBzVG4yWr528539Kme5CEZcABNr3rbzGpr76enhArjhlsnhHfRWs9xTzmPQLZpaw9yMVYZgevrWoIKiuKj89LQHqFWkddRxuehQNh2HrPuDLJTmUZvCfErufmrjjkOd9FKUbYpwrzZB8eoMIntpSzUXc8RaBmE3QCIQB16MXhMm4Q3TTSMC53cPDlAqCemD88cZNbS9wTMyqUuauQQKDZOpFYBmmHbJ6odrFw1jxWWrJTpm6Lf5ezr7mjJ9wrWlKtVIjHtIdBHZWE6P9xIgl7g4Z0RUKvbhE2RfzpuvcxQZOwoxueBjInfth3IQjqlEHaK03U5sYoeaku5porYAANaAAxuduQz8smMbbH15KlLBgbwR1L6s7jBygv395dh28u9Isog7DLM5Kg1WUvLYh7LMbfnvbQ7eBFENAbfLvFOxzzy8RhV4bsU1Z5qpjpGM0lzlPV6TiqXoJwY1HHpdKBjq3n9yabcQgXLcgNBu8p1e07oI8DRat3YQonX04EoOw6GU2OeeoVRMay5Q0YetVFpMLNs6D4Z4qB0ZDSAXF5Ll1nXGh7fvuzXBY4SAV9AhRnxLpJl2hcUT6irHal0QPe0OgzFAEL6Cc5sf3SwkUBLIwpqzXaTHD5IylNyvGVXmI0x6aHBtoTkosOX778umnaMrCwOG0MHmKmLBUOmxCtbDPPeWMwHstwaUjeTPrsLBMldEc9Wy4odN";
//        B = "nNYbBKeom7CEqpy8O9eCuYwA";
//
//        int len1 = t1.length();
//        int le2 = t2.length();
//        String res = minWindow.minWindow(A, B);
//        System.out.print(res);

        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverseWords("    Jay is      awesome    ");
    }
}
