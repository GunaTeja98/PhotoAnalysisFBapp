package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {


        String s = "{\n" +
                "  \"albums\": {\n" +
                "    \"data\": [\n" +
                "      {\n" +
                "        \"photos\": {\n" +
                "          \"data\": [\n" +
                "            {\n" +
                "              \"images\": [\n" +
                "                {\n" +
                "                  \"height\": 720,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-9/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&oh=0a321c858693cc926d54145a0e24a5ce&oe=5FEC55EC\",\n" +
                "                  \"width\": 960\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 600,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p600x600/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=87cc5ff3736f746f8cb37185980a3de0&oe=5FEA2DDA\",\n" +
                "                  \"width\": 800\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 480,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p480x480/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=4a103b6c8a5eb3cad46199fa4270cb19&oe=5FE9AEF1\",\n" +
                "                  \"width\": 640\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 320,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p320x320/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=986998e38e8a316ecb2a94e38d69adda&oe=5FE9B738\",\n" +
                "                  \"width\": 427\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 540,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p180x540/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=ef978f8c92e49c188204feb79b7b9d16&oe=5FE9817D\",\n" +
                "                  \"width\": 720\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 130,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p130x130/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=4e687c6042d74bbf7dfefd73b7452911&oe=5FEB0ED1\",\n" +
                "                  \"width\": 173\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 225,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p75x225/128871142_969242773601384_2701896510528378849_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=ue_sZR6ADm8AX_vgszN&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=1bcb76ce53851afab89cd51e688a6811&oe=5FE9FDE8\",\n" +
                "                  \"width\": 300\n" +
                "                }\n" +
                "              ],\n" +
                "              \"created_time\": \"2020-11-30T09:25:26+0000\",\n" +
                "              \"id\": \"969242770268051\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"images\": [\n" +
                "                {\n" +
                "                  \"height\": 720,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-9/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&oh=b2b6c4448fee2c8cc534a99af7d785e4&oe=5FEBA58E\",\n" +
                "                  \"width\": 960\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 600,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p600x600/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=4327e5d84ba62e5638c30aa8257f5247&oe=5FEB0840\",\n" +
                "                  \"width\": 800\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 480,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p480x480/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=7b2109198bfc8abccd84c3af36338441&oe=5FED3097\",\n" +
                "                  \"width\": 640\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 320,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p320x320/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=3a973f52c5ae481b666d039805e747b8&oe=5FECAB52\",\n" +
                "                  \"width\": 427\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 540,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p180x540/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=8af9365ba9a0b607ce1235215e7374cf&oe=5FEB439B\",\n" +
                "                  \"width\": 720\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 130,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p130x130/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=59e0705c2581daeafda6a6f7bc22cd41&oe=5FEC5AB7\",\n" +
                "                  \"width\": 173\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 225,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p75x225/128546120_968485863677075_6252394233329813764_n.jpg?_nc_cat=108&ccb=2&_nc_sid=110474&_nc_ohc=4xbq1S2xwaYAX_vEVy_&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=9f8fef84c7b0d57ff1f4b941bce49207&oe=5FEBCF02\",\n" +
                "                  \"width\": 300\n" +
                "                }\n" +
                "              ],\n" +
                "              \"created_time\": \"2020-11-29T08:50:30+0000\",\n" +
                "              \"id\": \"968485860343742\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"likes\": {\n" +
                "                \"data\": [\n" +
                "                  {\n" +
                "                    \"id\": \"940530989805896\",\n" +
                "                    \"name\": \"Shixin Hu\"\n" +
                "                  }\n" +
                "                ],\n" +
                "                \"paging\": {\n" +
                "                  \"cursors\": {\n" +
                "                    \"before\": \"QVFIUlh3OFctOTc2YURxX0xKQ1lkcXhUb01ZAZAUE0YWJjbEx2LXN3MUlZAeFB2d0VfeDZAMLXdHdjZAOWHg1OE9xQXNvemNKZAG9Qa2NKV0JsWGwyNnhXVllNWGdB\",\n" +
                "                    \"after\": \"QVFIUnJVMWdyYTZAoZA25faHZABQ21xRDNzdmVFcDg1UFpkMDczS2JEWVR2LWxCU2o4TTNnLXUwY3p3VG1hTUlYdXdrc19sQ1BDTnh1UW9XQWFldHlPV3BKem13\"\n" +
                "                  }\n" +
                "                }\n" +
                "              },\n" +
                "              \"images\": [\n" +
                "                {\n" +
                "                  \"height\": 720,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-9/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&oh=4b1a93d6ad1f75bc6b40dfd328093de8&oe=5FECA0F7\",\n" +
                "                  \"width\": 960\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 600,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p600x600/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=b22fb8e8aa1d84d9389a18fef4f65219&oe=5FE9EC45\",\n" +
                "                  \"width\": 800\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 480,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p480x480/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=e964a6717f8c5a773bcc5c7fa41cf6f7&oe=5FEB13EE\",\n" +
                "                  \"width\": 640\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 320,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p320x320/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=f603c80940482571584a4da050fb7337&oe=5FE9DB2B\",\n" +
                "                  \"width\": 427\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 540,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p180x540/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=57c325de0cb7145e17d32583b3a67013&oe=5FEA51E2\",\n" +
                "                  \"width\": 720\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 130,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p130x130/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=46bbbd7a1f87a0f821101fd5c07fcb0a&oe=5FEAAD4E\",\n" +
                "                  \"width\": 173\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 225,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p75x225/128125546_966630637195931_4810019310077345363_n.jpg?_nc_cat=100&ccb=2&_nc_sid=110474&_nc_ohc=AEaxvahmrG0AX__dCdP&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=7f05642daabb42112b2b5cf0b23e04f6&oe=5FEC4E7B\",\n" +
                "                  \"width\": 300\n" +
                "                }\n" +
                "              ],\n" +
                "              \"created_time\": \"2020-11-27T01:11:35+0000\",\n" +
                "              \"id\": \"966630633862598\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"images\": [\n" +
                "                {\n" +
                "                  \"height\": 960,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-9/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&oh=6cfd8b916d7f9c485cbc77b0641d9011&oe=5FECE97B\",\n" +
                "                  \"width\": 720\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 800,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p600x600/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=74e6e05d4306e342be24910ee6eca198&oe=5FE9FFC9\",\n" +
                "                  \"width\": 600\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 640,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p480x480/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=f4b46e5703a8e87f3ab3b595ef062dd3&oe=5FECD0E2\",\n" +
                "                  \"width\": 480\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 427,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p320x320/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=5f5484c9f38b8d6bf8f4117321567c0a&oe=5FEA0EA7\",\n" +
                "                  \"width\": 320\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 540,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p180x540/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=4526abcd4fe98e792cb422a1b32e508a&oe=5FEB6EEE\",\n" +
                "                  \"width\": 405\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 173,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p130x130/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=3e7ff8e5fd042e1e3904d821efaf292c&oe=5FECB2C2\",\n" +
                "                  \"width\": 130\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 225,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p75x225/127276222_964560847402910_3816319990535940877_n.jpg?_nc_cat=103&ccb=2&_nc_sid=110474&_nc_ohc=OExoFWadRhMAX95shPL&_nc_oc=AQnMMzkm3TN-K7qrLK1aZIoqM5RBcMe431JDB4JRE_rbd8NV7WWV4w6Z2rIkNsbXDq4&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=63d19b509203f6258fc465ff289cbd52&oe=5FE96B77\",\n" +
                "                  \"width\": 169\n" +
                "                }\n" +
                "              ],\n" +
                "              \"created_time\": \"2020-11-24T07:02:34+0000\",\n" +
                "              \"id\": \"964560844069577\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"likes\": {\n" +
                "                \"data\": [\n" +
                "                  {\n" +
                "                    \"id\": \"940530989805896\",\n" +
                "                    \"name\": \"Shixin Hu\"\n" +
                "                  }\n" +
                "                ],\n" +
                "                \"paging\": {\n" +
                "                  \"cursors\": {\n" +
                "                    \"before\": \"QVFIUm1JTTBfaEdFaktid1lzb3pZAcHFOT1NuTDBzbVMtdnE3ZAEtQaG00bnM0SDNWMURsd0xxcHpnQTY0RF8zaUFNOEJHdGRoYkIxS2YwWXNGSUdxTmNuRUxn\",\n" +
                "                    \"after\": \"QVFIUkJrbTdnRF9SSi10TU5BVnhaNVV5OUpadmhCeEdJcWE4bG5XNFF6eFFkWEl5WVVhQ0hTeVJGeVJxaTJTT0VFSnhlR0RvVEswemM2VWJUMWJ3V1Yyd0JR\"\n" +
                "                  }\n" +
                "                }\n" +
                "              },\n" +
                "              \"images\": [\n" +
                "                {\n" +
                "                  \"height\": 960,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-9/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&oh=104fa4481e26d4332e956ebaf22830a0&oe=5FED0A02\",\n" +
                "                  \"width\": 720\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 800,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p600x600/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=c72dbb49bfade9df288c8ccfe2232ffb&oe=5FEACCB4\",\n" +
                "                  \"width\": 600\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 640,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p480x480/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=957627b0d73da846a4abfaacf1d56197&oe=5FED051B\",\n" +
                "                  \"width\": 480\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 427,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p320x320/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=99ad9df07ab88ca54313d199f123dc2b&oe=5FE999DE\",\n" +
                "                  \"width\": 320\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 540,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p180x540/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=fc71cb1dbda9573f4751b7b72f03dcd6&oe=5FE9D697\",\n" +
                "                  \"width\": 405\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 173,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p130x130/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=0c2a84a408554a655a14ee2426e86d36&oe=5FEB36BB\",\n" +
                "                  \"width\": 130\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 225,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p75x225/125178955_954839471708381_1839396585296945290_n.jpg?_nc_cat=101&ccb=2&_nc_sid=110474&_nc_ohc=yEP1e6bMFmIAX-qXq_l&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=db07b486594611cd467e870f98017fd4&oe=5FEB9F8E\",\n" +
                "                  \"width\": 169\n" +
                "                }\n" +
                "              ],\n" +
                "              \"created_time\": \"2020-11-12T19:40:10+0000\",\n" +
                "              \"id\": \"954839468375048\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"paging\": {\n" +
                "            \"cursors\": {\n" +
                "              \"before\": \"OTY5MjQyNzcwMjY4MDUx\",\n" +
                "              \"after\": \"OTU0ODM5NDY4Mzc1MDQ4\"\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"id\": \"954839595041702\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"photos\": {\n" +
                "          \"data\": [\n" +
                "            {\n" +
                "              \"images\": [\n" +
                "                {\n" +
                "                  \"height\": 960,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-9/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&oh=5e76b49bb13574110d8c19d5679b8f3e&oe=5FEC2343\",\n" +
                "                  \"width\": 720\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 800,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p600x600/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=dfcc3defbd8130b068c311cbbc6df995&oe=5FEC58F1\",\n" +
                "                  \"width\": 600\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 640,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p480x480/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=8e13ac33db80e590600fc796431024e5&oe=5FEA66DA\",\n" +
                "                  \"width\": 480\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 427,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p320x320/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=dbd7884c951f50474d889fec6bcf2bbe&oe=5FEC0F1F\",\n" +
                "                  \"width\": 320\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 540,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p180x540/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=252977cc2e5b103e67338a17524213fe&oe=5FEABCD6\",\n" +
                "                  \"width\": 405\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 173,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p130x130/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=13931fb06524a7f307caa49abcf0d020&oe=5FECB37A\",\n" +
                "                  \"width\": 130\n" +
                "                },\n" +
                "                {\n" +
                "                  \"height\": 225,\n" +
                "                  \"source\": \"https://scontent-sjc3-1.xx.fbcdn.net/v/t1.0-0/p75x225/127801819_965892080603120_7865109935215997333_n.jpg?_nc_cat=100&ccb=2&_nc_sid=85a577&_nc_ohc=TzdGg887yUkAX924w25&_nc_ht=scontent-sjc3-1.xx&tp=6&oh=d10e6bccaeba92908c8003636b173bb3&oe=5FEAEE4F\",\n" +
                "                  \"width\": 169\n" +
                "                }\n" +
                "              ],\n" +
                "              \"created_time\": \"2020-11-26T01:39:57+0000\",\n" +
                "              \"id\": \"965892077269787\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"paging\": {\n" +
                "            \"cursors\": {\n" +
                "              \"before\": \"OTY1ODkyMDc3MjY5Nzg3\",\n" +
                "              \"after\": \"OTY1ODkyMDc3MjY5Nzg3\"\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"id\": \"192540557938280\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"paging\": {\n" +
                "      \"cursors\": {\n" +
                "        \"before\": \"OTU0ODM5NTk1MDQxNzAy\",\n" +
                "        \"after\": \"MTkyNTQwNTU3OTM4Mjgw\"\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"id\": \"940530989805896\"\n" +
                "}";
        JSONObject jsonObject = JSON.parseObject(s);
        String user_id = jsonObject.getString("id");

        System.out.println(user_id);
    }
}
