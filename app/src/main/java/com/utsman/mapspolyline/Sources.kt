package com.utsman.mapspolyline

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Sources {

    val json = """
        {
            "status": true,
            "message": "success",
            "data": {
                "route": [
                    {
                        "latitude": -6.353474,
                        "longitude": 106.83168
                    },
                    {
                        "latitude": -6.35332,
                        "longitude": 106.8317
                    },
                    {
                        "latitude": -6.35298,
                        "longitude": 106.83175
                    },
                    {
                        "latitude": -6.35261,
                        "longitude": 106.83179
                    },
                    {
                        "latitude": -6.35246,
                        "longitude": 106.8318
                    },
                    {
                        "latitude": -6.3523,
                        "longitude": 106.83179
                    },
                    {
                        "latitude": -6.35202,
                        "longitude": 106.83171
                    },
                    {
                        "latitude": -6.35185,
                        "longitude": 106.83165
                    },
                    {
                        "latitude": -6.35182,
                        "longitude": 106.83174
                    },
                    {
                        "latitude": -6.35193,
                        "longitude": 106.83179
                    },
                    {
                        "latitude": -6.35225,
                        "longitude": 106.83189
                    },
                    {
                        "latitude": -6.35246,
                        "longitude": 106.8319
                    },
                    {
                        "latitude": -6.35282,
                        "longitude": 106.83189
                    },
                    {
                        "latitude": -6.35299,
                        "longitude": 106.83186
                    },
                    {
                        "latitude": -6.35321,
                        "longitude": 106.83182
                    },
                    {
                        "latitude": -6.35354,
                        "longitude": 106.83177
                    },
                    {
                        "latitude": -6.35402,
                        "longitude": 106.83168
                    },
                    {
                        "latitude": -6.35425,
                        "longitude": 106.8316
                    },
                    {
                        "latitude": -6.35448,
                        "longitude": 106.83149
                    },
                    {
                        "latitude": -6.35512,
                        "longitude": 106.83099
                    },
                    {
                        "latitude": -6.35527,
                        "longitude": 106.83087
                    },
                    {
                        "latitude": -6.35599,
                        "longitude": 106.83031
                    },
                    {
                        "latitude": -6.35612,
                        "longitude": 106.83025
                    },
                    {
                        "latitude": -6.35627,
                        "longitude": 106.83021
                    },
                    {
                        "latitude": -6.35643,
                        "longitude": 106.83019
                    },
                    {
                        "latitude": -6.35659,
                        "longitude": 106.83019
                    },
                    {
                        "latitude": -6.35672,
                        "longitude": 106.83022
                    },
                    {
                        "latitude": -6.35685,
                        "longitude": 106.83027
                    },
                    {
                        "latitude": -6.35703,
                        "longitude": 106.83038
                    },
                    {
                        "latitude": -6.35788,
                        "longitude": 106.83101
                    },
                    {
                        "latitude": -6.35797,
                        "longitude": 106.83105
                    },
                    {
                        "latitude": -6.35773,
                        "longitude": 106.83106
                    },
                    {
                        "latitude": -6.35764,
                        "longitude": 106.83106
                    },
                    {
                        "latitude": -6.35754,
                        "longitude": 106.83104
                    },
                    {
                        "latitude": -6.35745,
                        "longitude": 106.83101
                    },
                    {
                        "latitude": -6.35738,
                        "longitude": 106.83097
                    },
                    {
                        "latitude": -6.35721,
                        "longitude": 106.83084
                    },
                    {
                        "latitude": -6.35675,
                        "longitude": 106.83048
                    },
                    {
                        "latitude": -6.3567,
                        "longitude": 106.83044
                    },
                    {
                        "latitude": -6.35664,
                        "longitude": 106.8304
                    },
                    {
                        "latitude": -6.35655,
                        "longitude": 106.83037
                    },
                    {
                        "latitude": -6.35642,
                        "longitude": 106.83035
                    },
                    {
                        "latitude": -6.35632,
                        "longitude": 106.83036
                    },
                    {
                        "latitude": -6.35619,
                        "longitude": 106.83038
                    },
                    {
                        "latitude": -6.35611,
                        "longitude": 106.83043
                    },
                    {
                        "latitude": -6.35601,
                        "longitude": 106.83052
                    },
                    {
                        "latitude": -6.35594,
                        "longitude": 106.8306
                    },
                    {
                        "latitude": -6.35588,
                        "longitude": 106.83069
                    },
                    {
                        "latitude": -6.35583,
                        "longitude": 106.83079
                    },
                    {
                        "latitude": -6.35579,
                        "longitude": 106.83091
                    },
                    {
                        "latitude": -6.35575,
                        "longitude": 106.83109
                    },
                    {
                        "latitude": -6.35571,
                        "longitude": 106.83139
                    },
                    {
                        "latitude": -6.35569,
                        "longitude": 106.83153
                    },
                    {
                        "latitude": -6.35566,
                        "longitude": 106.83175
                    },
                    {
                        "latitude": -6.35564,
                        "longitude": 106.83196
                    },
                    {
                        "latitude": -6.35563,
                        "longitude": 106.83204
                    },
                    {
                        "latitude": -6.35561,
                        "longitude": 106.83218
                    },
                    {
                        "latitude": -6.35557,
                        "longitude": 106.83248
                    },
                    {
                        "latitude": -6.3555,
                        "longitude": 106.83287
                    },
                    {
                        "latitude": -6.35548,
                        "longitude": 106.83297
                    },
                    {
                        "latitude": -6.35547,
                        "longitude": 106.83304
                    },
                    {
                        "latitude": -6.35544,
                        "longitude": 106.83324
                    },
                    {
                        "latitude": -6.3553,
                        "longitude": 106.83432
                    },
                    {
                        "latitude": -6.35518,
                        "longitude": 106.83472
                    },
                    {
                        "latitude": -6.35508,
                        "longitude": 106.83493
                    },
                    {
                        "latitude": -6.35505,
                        "longitude": 106.83506
                    },
                    {
                        "latitude": -6.35496,
                        "longitude": 106.83529
                    },
                    {
                        "latitude": -6.3549,
                        "longitude": 106.8354
                    },
                    {
                        "latitude": -6.35469,
                        "longitude": 106.83574
                    },
                    {
                        "latitude": -6.35457,
                        "longitude": 106.83594
                    },
                    {
                        "latitude": -6.35449,
                        "longitude": 106.83607
                    },
                    {
                        "latitude": -6.35445,
                        "longitude": 106.83614
                    },
                    {
                        "latitude": -6.35432,
                        "longitude": 106.83634
                    },
                    {
                        "latitude": -6.35416,
                        "longitude": 106.83661
                    },
                    {
                        "latitude": -6.35408,
                        "longitude": 106.83676
                    },
                    {
                        "latitude": -6.35398,
                        "longitude": 106.83696
                    },
                    {
                        "latitude": -6.35394,
                        "longitude": 106.83708
                    },
                    {
                        "latitude": -6.35392,
                        "longitude": 106.83719
                    },
                    {
                        "latitude": -6.35391,
                        "longitude": 106.83728
                    },
                    {
                        "latitude": -6.3539,
                        "longitude": 106.83742
                    },
                    {
                        "latitude": -6.3539,
                        "longitude": 106.83757
                    },
                    {
                        "latitude": -6.35391,
                        "longitude": 106.83767
                    },
                    {
                        "latitude": -6.35397,
                        "longitude": 106.83795
                    },
                    {
                        "latitude": -6.35401,
                        "longitude": 106.83807
                    },
                    {
                        "latitude": -6.35411,
                        "longitude": 106.83839
                    },
                    {
                        "latitude": -6.35418,
                        "longitude": 106.83857
                    },
                    {
                        "latitude": -6.35428,
                        "longitude": 106.83882
                    },
                    {
                        "latitude": -6.35435,
                        "longitude": 106.83902
                    },
                    {
                        "latitude": -6.35441,
                        "longitude": 106.83919
                    },
                    {
                        "latitude": -6.35445,
                        "longitude": 106.8393
                    },
                    {
                        "latitude": -6.35454,
                        "longitude": 106.83953
                    },
                    {
                        "latitude": -6.35471,
                        "longitude": 106.83994
                    },
                    {
                        "latitude": -6.35475,
                        "longitude": 106.84007
                    },
                    {
                        "latitude": -6.35483,
                        "longitude": 106.84042
                    },
                    {
                        "latitude": -6.3549,
                        "longitude": 106.8407
                    },
                    {
                        "latitude": -6.35487,
                        "longitude": 106.84086
                    },
                    {
                        "latitude": -6.3549,
                        "longitude": 106.84141
                    },
                    {
                        "latitude": -6.3549,
                        "longitude": 106.8417
                    },
                    {
                        "latitude": -6.35486,
                        "longitude": 106.84212
                    },
                    {
                        "latitude": -6.35481,
                        "longitude": 106.84223
                    },
                    {
                        "latitude": -6.35481,
                        "longitude": 106.84247
                    },
                    {
                        "latitude": -6.35481,
                        "longitude": 106.84267
                    },
                    {
                        "latitude": -6.35481,
                        "longitude": 106.84283
                    },
                    {
                        "latitude": -6.35482,
                        "longitude": 106.84303
                    },
                    {
                        "latitude": -6.35483,
                        "longitude": 106.84326
                    },
                    {
                        "latitude": -6.35484,
                        "longitude": 106.84346
                    },
                    {
                        "latitude": -6.35491,
                        "longitude": 106.84357
                    },
                    {
                        "latitude": -6.35497,
                        "longitude": 106.84402
                    },
                    {
                        "latitude": -6.35497,
                        "longitude": 106.84454
                    },
                    {
                        "latitude": -6.35496,
                        "longitude": 106.8447
                    },
                    {
                        "latitude": -6.35494,
                        "longitude": 106.84493
                    },
                    {
                        "latitude": -6.35493,
                        "longitude": 106.84513
                    },
                    {
                        "latitude": -6.35491,
                        "longitude": 106.84533
                    },
                    {
                        "latitude": -6.35488,
                        "longitude": 106.84562
                    },
                    {
                        "latitude": -6.35484,
                        "longitude": 106.84594
                    },
                    {
                        "latitude": -6.35482,
                        "longitude": 106.84616
                    },
                    {
                        "latitude": -6.35482,
                        "longitude": 106.84642
                    },
                    {
                        "latitude": -6.35483,
                        "longitude": 106.84656
                    },
                    {
                        "latitude": -6.35486,
                        "longitude": 106.84681
                    },
                    {
                        "latitude": -6.35498,
                        "longitude": 106.84732
                    },
                    {
                        "latitude": -6.35502,
                        "longitude": 106.84752
                    },
                    {
                        "latitude": -6.3551,
                        "longitude": 106.84788
                    },
                    {
                        "latitude": -6.35519,
                        "longitude": 106.84832
                    },
                    {
                        "latitude": -6.35524,
                        "longitude": 106.84862
                    },
                    {
                        "latitude": -6.35531,
                        "longitude": 106.84896
                    },
                    {
                        "latitude": -6.35542,
                        "longitude": 106.84954
                    },
                    {
                        "latitude": -6.35544,
                        "longitude": 106.8497
                    },
                    {
                        "latitude": -6.35546,
                        "longitude": 106.84998
                    },
                    {
                        "latitude": -6.35545,
                        "longitude": 106.85008
                    },
                    {
                        "latitude": -6.35544,
                        "longitude": 106.85017
                    },
                    {
                        "latitude": -6.35539,
                        "longitude": 106.85107
                    },
                    {
                        "latitude": -6.35539,
                        "longitude": 106.85171
                    },
                    {
                        "latitude": -6.35539,
                        "longitude": 106.85183
                    },
                    {
                        "latitude": -6.35541,
                        "longitude": 106.85215
                    },
                    {
                        "latitude": -6.35549,
                        "longitude": 106.85297
                    },
                    {
                        "latitude": -6.35551,
                        "longitude": 106.85308
                    },
                    {
                        "latitude": -6.35553,
                        "longitude": 106.85318
                    },
                    {
                        "latitude": -6.35557,
                        "longitude": 106.85334
                    },
                    {
                        "latitude": -6.35561,
                        "longitude": 106.85353
                    },
                    {
                        "latitude": -6.35576,
                        "longitude": 106.85448
                    },
                    {
                        "latitude": -6.35577,
                        "longitude": 106.85457
                    },
                    {
                        "latitude": -6.35581,
                        "longitude": 106.8548
                    },
                    {
                        "latitude": -6.35584,
                        "longitude": 106.85499
                    },
                    {
                        "latitude": -6.35585,
                        "longitude": 106.85505
                    },
                    {
                        "latitude": -6.35589,
                        "longitude": 106.85531
                    },
                    {
                        "latitude": -6.35595,
                        "longitude": 106.85561
                    },
                    {
                        "latitude": -6.35603,
                        "longitude": 106.85588
                    },
                    {
                        "latitude": -6.35614,
                        "longitude": 106.85616
                    },
                    {
                        "latitude": -6.35629,
                        "longitude": 106.85646
                    },
                    {
                        "latitude": -6.35634,
                        "longitude": 106.85655
                    },
                    {
                        "latitude": -6.35652,
                        "longitude": 106.85686
                    },
                    {
                        "latitude": -6.35665,
                        "longitude": 106.85709
                    },
                    {
                        "latitude": -6.35671,
                        "longitude": 106.8572
                    },
                    {
                        "latitude": -6.35675,
                        "longitude": 106.85728
                    },
                    {
                        "latitude": -6.35699,
                        "longitude": 106.85773
                    },
                    {
                        "latitude": -6.3571,
                        "longitude": 106.85793
                    },
                    {
                        "latitude": -6.35757,
                        "longitude": 106.85886
                    },
                    {
                        "latitude": -6.35768,
                        "longitude": 106.85911
                    },
                    {
                        "latitude": -6.3577,
                        "longitude": 106.85917
                    },
                    {
                        "latitude": -6.35772,
                        "longitude": 106.85925
                    },
                    {
                        "latitude": -6.35685,
                        "longitude": 106.85935
                    },
                    {
                        "latitude": -6.35662,
                        "longitude": 106.85938
                    },
                    {
                        "latitude": -6.35635,
                        "longitude": 106.85944
                    },
                    {
                        "latitude": -6.35611,
                        "longitude": 106.8595
                    },
                    {
                        "latitude": -6.3559,
                        "longitude": 106.85954
                    },
                    {
                        "latitude": -6.35567,
                        "longitude": 106.85957
                    },
                    {
                        "latitude": -6.35545,
                        "longitude": 106.85961
                    },
                    {
                        "latitude": -6.35503,
                        "longitude": 106.8597
                    },
                    {
                        "latitude": -6.35462,
                        "longitude": 106.8598
                    },
                    {
                        "latitude": -6.35439,
                        "longitude": 106.8599
                    },
                    {
                        "latitude": -6.35416,
                        "longitude": 106.86
                    },
                    {
                        "latitude": -6.35405,
                        "longitude": 106.86006
                    },
                    {
                        "latitude": -6.35377,
                        "longitude": 106.86025
                    },
                    {
                        "latitude": -6.35367,
                        "longitude": 106.86033
                    },
                    {
                        "latitude": -6.35354,
                        "longitude": 106.86045
                    },
                    {
                        "latitude": -6.35348,
                        "longitude": 106.86051
                    },
                    {
                        "latitude": -6.35337,
                        "longitude": 106.86065
                    },
                    {
                        "latitude": -6.35317,
                        "longitude": 106.86095
                    },
                    {
                        "latitude": -6.35314,
                        "longitude": 106.861
                    },
                    {
                        "latitude": -6.35309,
                        "longitude": 106.86109
                    },
                    {
                        "latitude": -6.35302,
                        "longitude": 106.86121
                    },
                    {
                        "latitude": -6.35295,
                        "longitude": 106.86133
                    },
                    {
                        "latitude": -6.35287,
                        "longitude": 106.86146
                    },
                    {
                        "latitude": -6.35273,
                        "longitude": 106.86171
                    },
                    {
                        "latitude": -6.35261,
                        "longitude": 106.86191
                    },
                    {
                        "latitude": -6.35229,
                        "longitude": 106.86243
                    },
                    {
                        "latitude": -6.35219,
                        "longitude": 106.8626
                    },
                    {
                        "latitude": -6.35205,
                        "longitude": 106.86283
                    },
                    {
                        "latitude": -6.35187,
                        "longitude": 106.86312
                    },
                    {
                        "latitude": -6.35167,
                        "longitude": 106.86345
                    },
                    {
                        "latitude": -6.35161,
                        "longitude": 106.86355
                    },
                    {
                        "latitude": -6.35131,
                        "longitude": 106.86402
                    },
                    {
                        "latitude": -6.3511,
                        "longitude": 106.86434
                    },
                    {
                        "latitude": -6.35093,
                        "longitude": 106.86456
                    },
                    {
                        "latitude": -6.35089,
                        "longitude": 106.86461
                    },
                    {
                        "latitude": -6.35081,
                        "longitude": 106.86471
                    },
                    {
                        "latitude": -6.35054,
                        "longitude": 106.86502
                    },
                    {
                        "latitude": -6.35041,
                        "longitude": 106.86516
                    },
                    {
                        "latitude": -6.35025,
                        "longitude": 106.8653
                    },
                    {
                        "latitude": -6.35012,
                        "longitude": 106.86541
                    },
                    {
                        "latitude": -6.35007,
                        "longitude": 106.86545
                    },
                    {
                        "latitude": -6.34995,
                        "longitude": 106.86553
                    },
                    {
                        "latitude": -6.34946,
                        "longitude": 106.86583
                    },
                    {
                        "latitude": -6.34928,
                        "longitude": 106.86594
                    },
                    {
                        "latitude": -6.34885,
                        "longitude": 106.86616
                    },
                    {
                        "latitude": -6.34831,
                        "longitude": 106.86644
                    },
                    {
                        "latitude": -6.34818,
                        "longitude": 106.8665
                    },
                    {
                        "latitude": -6.34767,
                        "longitude": 106.86675
                    },
                    {
                        "latitude": -6.34677,
                        "longitude": 106.86719
                    },
                    {
                        "latitude": -6.34671,
                        "longitude": 106.86722
                    },
                    {
                        "latitude": -6.34595,
                        "longitude": 106.86758
                    },
                    {
                        "latitude": -6.34582,
                        "longitude": 106.86764
                    },
                    {
                        "latitude": -6.34569,
                        "longitude": 106.8677
                    },
                    {
                        "latitude": -6.34556,
                        "longitude": 106.86776
                    },
                    {
                        "latitude": -6.34536,
                        "longitude": 106.86786
                    },
                    {
                        "latitude": -6.34507,
                        "longitude": 106.868
                    },
                    {
                        "latitude": -6.34476,
                        "longitude": 106.86815
                    },
                    {
                        "latitude": -6.34454,
                        "longitude": 106.86825
                    },
                    {
                        "latitude": -6.3443,
                        "longitude": 106.86836
                    },
                    {
                        "latitude": -6.34413,
                        "longitude": 106.86844
                    },
                    {
                        "latitude": -6.34397,
                        "longitude": 106.86853
                    },
                    {
                        "latitude": -6.34379,
                        "longitude": 106.86862
                    },
                    {
                        "latitude": -6.34355,
                        "longitude": 106.86873
                    },
                    {
                        "latitude": -6.34336,
                        "longitude": 106.86883
                    },
                    {
                        "latitude": -6.34315,
                        "longitude": 106.86893
                    },
                    {
                        "latitude": -6.34287,
                        "longitude": 106.86904
                    },
                    {
                        "latitude": -6.34268,
                        "longitude": 106.86911
                    },
                    {
                        "latitude": -6.34248,
                        "longitude": 106.86917
                    },
                    {
                        "latitude": -6.34232,
                        "longitude": 106.8692
                    },
                    {
                        "latitude": -6.34213,
                        "longitude": 106.86922
                    },
                    {
                        "latitude": -6.342,
                        "longitude": 106.86923
                    },
                    {
                        "latitude": -6.34176,
                        "longitude": 106.86925
                    },
                    {
                        "latitude": -6.34151,
                        "longitude": 106.86926
                    },
                    {
                        "latitude": -6.34124,
                        "longitude": 106.86926
                    },
                    {
                        "latitude": -6.34113,
                        "longitude": 106.86925
                    },
                    {
                        "latitude": -6.34104,
                        "longitude": 106.86924
                    },
                    {
                        "latitude": -6.34069,
                        "longitude": 106.8692
                    },
                    {
                        "latitude": -6.34061,
                        "longitude": 106.86919
                    },
                    {
                        "latitude": -6.34038,
                        "longitude": 106.86914
                    },
                    {
                        "latitude": -6.33996,
                        "longitude": 106.86903
                    },
                    {
                        "latitude": -6.33988,
                        "longitude": 106.86901
                    },
                    {
                        "latitude": -6.33941,
                        "longitude": 106.86889
                    },
                    {
                        "latitude": -6.33931,
                        "longitude": 106.86886
                    },
                    {
                        "latitude": -6.3388,
                        "longitude": 106.86872
                    },
                    {
                        "latitude": -6.33809,
                        "longitude": 106.86851
                    },
                    {
                        "latitude": -6.33766,
                        "longitude": 106.86839
                    },
                    {
                        "latitude": -6.33662,
                        "longitude": 106.8681
                    },
                    {
                        "latitude": -6.33651,
                        "longitude": 106.86807
                    },
                    {
                        "latitude": -6.33638,
                        "longitude": 106.86804
                    },
                    {
                        "latitude": -6.33617,
                        "longitude": 106.86799
                    },
                    {
                        "latitude": -6.33594,
                        "longitude": 106.86794
                    },
                    {
                        "latitude": -6.33561,
                        "longitude": 106.86789
                    },
                    {
                        "latitude": -6.33531,
                        "longitude": 106.86786
                    },
                    {
                        "latitude": -6.33482,
                        "longitude": 106.86783
                    },
                    {
                        "latitude": -6.33448,
                        "longitude": 106.86779
                    },
                    {
                        "latitude": -6.33382,
                        "longitude": 106.86771
                    },
                    {
                        "latitude": -6.33312,
                        "longitude": 106.86763
                    },
                    {
                        "latitude": -6.33268,
                        "longitude": 106.86758
                    },
                    {
                        "latitude": -6.33241,
                        "longitude": 106.86756
                    },
                    {
                        "latitude": -6.33226,
                        "longitude": 106.86754
                    },
                    {
                        "latitude": -6.33213,
                        "longitude": 106.86751
                    },
                    {
                        "latitude": -6.332,
                        "longitude": 106.86747
                    },
                    {
                        "latitude": -6.33184,
                        "longitude": 106.86741
                    },
                    {
                        "latitude": -6.33168,
                        "longitude": 106.86735
                    },
                    {
                        "latitude": -6.33153,
                        "longitude": 106.86729
                    },
                    {
                        "latitude": -6.33139,
                        "longitude": 106.86723
                    },
                    {
                        "latitude": -6.33128,
                        "longitude": 106.86718
                    },
                    {
                        "latitude": -6.33099,
                        "longitude": 106.86705
                    },
                    {
                        "latitude": -6.33087,
                        "longitude": 106.86699
                    },
                    {
                        "latitude": -6.33073,
                        "longitude": 106.86692
                    },
                    {
                        "latitude": -6.33057,
                        "longitude": 106.86684
                    },
                    {
                        "latitude": -6.33046,
                        "longitude": 106.86677
                    },
                    {
                        "latitude": -6.33034,
                        "longitude": 106.86668
                    },
                    {
                        "latitude": -6.33021,
                        "longitude": 106.86657
                    },
                    {
                        "latitude": -6.33006,
                        "longitude": 106.86644
                    },
                    {
                        "latitude": -6.32979,
                        "longitude": 106.86618
                    },
                    {
                        "latitude": -6.32938,
                        "longitude": 106.86576
                    },
                    {
                        "latitude": -6.32896,
                        "longitude": 106.86532
                    },
                    {
                        "latitude": -6.32882,
                        "longitude": 106.86518
                    },
                    {
                        "latitude": -6.32861,
                        "longitude": 106.86498
                    },
                    {
                        "latitude": -6.32848,
                        "longitude": 106.86486
                    },
                    {
                        "latitude": -6.32829,
                        "longitude": 106.86469
                    },
                    {
                        "latitude": -6.32812,
                        "longitude": 106.86454
                    },
                    {
                        "latitude": -6.32798,
                        "longitude": 106.86443
                    },
                    {
                        "latitude": -6.32784,
                        "longitude": 106.86433
                    },
                    {
                        "latitude": -6.32768,
                        "longitude": 106.86423
                    },
                    {
                        "latitude": -6.32753,
                        "longitude": 106.86414
                    },
                    {
                        "latitude": -6.32741,
                        "longitude": 106.86407
                    },
                    {
                        "latitude": -6.32729,
                        "longitude": 106.86401
                    },
                    {
                        "latitude": -6.32715,
                        "longitude": 106.86395
                    },
                    {
                        "latitude": -6.32701,
                        "longitude": 106.8639
                    },
                    {
                        "latitude": -6.32682,
                        "longitude": 106.86384
                    },
                    {
                        "latitude": -6.32668,
                        "longitude": 106.8638
                    },
                    {
                        "latitude": -6.32659,
                        "longitude": 106.86379
                    },
                    {
                        "latitude": -6.32644,
                        "longitude": 106.86378
                    },
                    {
                        "latitude": -6.3263,
                        "longitude": 106.86378
                    },
                    {
                        "latitude": -6.32613,
                        "longitude": 106.86379
                    },
                    {
                        "latitude": -6.32596,
                        "longitude": 106.86381
                    },
                    {
                        "latitude": -6.32582,
                        "longitude": 106.86383
                    },
                    {
                        "latitude": -6.32572,
                        "longitude": 106.86385
                    },
                    {
                        "latitude": -6.32553,
                        "longitude": 106.8639
                    },
                    {
                        "latitude": -6.32533,
                        "longitude": 106.86396
                    },
                    {
                        "latitude": -6.32512,
                        "longitude": 106.86403
                    },
                    {
                        "latitude": -6.32482,
                        "longitude": 106.86413
                    },
                    {
                        "latitude": -6.32456,
                        "longitude": 106.86422
                    },
                    {
                        "latitude": -6.3243,
                        "longitude": 106.8643
                    },
                    {
                        "latitude": -6.32406,
                        "longitude": 106.86437
                    },
                    {
                        "latitude": -6.32391,
                        "longitude": 106.86441
                    },
                    {
                        "latitude": -6.32362,
                        "longitude": 106.86449
                    },
                    {
                        "latitude": -6.32278,
                        "longitude": 106.86473
                    },
                    {
                        "latitude": -6.32233,
                        "longitude": 106.86487
                    },
                    {
                        "latitude": -6.32208,
                        "longitude": 106.86494
                    },
                    {
                        "latitude": -6.3216,
                        "longitude": 106.86507
                    },
                    {
                        "latitude": -6.32148,
                        "longitude": 106.8651
                    },
                    {
                        "latitude": -6.3213,
                        "longitude": 106.86513
                    },
                    {
                        "latitude": -6.32118,
                        "longitude": 106.86514
                    },
                    {
                        "latitude": -6.32102,
                        "longitude": 106.86515
                    },
                    {
                        "latitude": -6.32089,
                        "longitude": 106.86515
                    },
                    {
                        "latitude": -6.32069,
                        "longitude": 106.86514
                    },
                    {
                        "latitude": -6.32048,
                        "longitude": 106.86513
                    },
                    {
                        "latitude": -6.32032,
                        "longitude": 106.86511
                    },
                    {
                        "latitude": -6.32012,
                        "longitude": 106.86507
                    },
                    {
                        "latitude": -6.3199,
                        "longitude": 106.86502
                    },
                    {
                        "latitude": -6.31969,
                        "longitude": 106.86496
                    },
                    {
                        "latitude": -6.31956,
                        "longitude": 106.86492
                    },
                    {
                        "latitude": -6.31933,
                        "longitude": 106.86484
                    },
                    {
                        "latitude": -6.31909,
                        "longitude": 106.86475
                    },
                    {
                        "latitude": -6.31889,
                        "longitude": 106.86469
                    },
                    {
                        "latitude": -6.31844,
                        "longitude": 106.86456
                    },
                    {
                        "latitude": -6.31784,
                        "longitude": 106.86437
                    },
                    {
                        "latitude": -6.31769,
                        "longitude": 106.86432
                    },
                    {
                        "latitude": -6.3175,
                        "longitude": 106.86425
                    },
                    {
                        "latitude": -6.31725,
                        "longitude": 106.86415
                    },
                    {
                        "latitude": -6.31708,
                        "longitude": 106.86408
                    },
                    {
                        "latitude": -6.31693,
                        "longitude": 106.86401
                    },
                    {
                        "latitude": -6.31672,
                        "longitude": 106.86391
                    },
                    {
                        "latitude": -6.31645,
                        "longitude": 106.86379
                    },
                    {
                        "latitude": -6.31616,
                        "longitude": 106.86367
                    },
                    {
                        "latitude": -6.31583,
                        "longitude": 106.86355
                    },
                    {
                        "latitude": -6.31558,
                        "longitude": 106.86346
                    },
                    {
                        "latitude": -6.31565,
                        "longitude": 106.86327
                    },
                    {
                        "latitude": -6.31574,
                        "longitude": 106.86304
                    },
                    {
                        "latitude": -6.31525,
                        "longitude": 106.86287
                    },
                    {
                        "latitude": -6.31463,
                        "longitude": 106.86266
                    },
                    {
                        "latitude": -6.31435,
                        "longitude": 106.86255
                    },
                    {
                        "latitude": -6.31334,
                        "longitude": 106.86228
                    },
                    {
                        "latitude": -6.31319,
                        "longitude": 106.86226
                    },
                    {
                        "latitude": -6.31314,
                        "longitude": 106.86222
                    },
                    {
                        "latitude": -6.31311,
                        "longitude": 106.86218
                    },
                    {
                        "latitude": -6.31309,
                        "longitude": 106.86211
                    },
                    {
                        "latitude": -6.31303,
                        "longitude": 106.86206
                    },
                    {
                        "latitude": -6.312552,
                        "longitude": 106.861809
                    }
                ]
            }
        }
    """.trimIndent()

    fun getResultRoutes(): ResultRoutes {
        val gson = Gson()
        return gson.fromJson(json, object : TypeToken<ResultRoutes>() {}.type)
    }
}