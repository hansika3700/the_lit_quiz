package com.hansika.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //question1

        val que1 = Question(
            1,
            "In which film did Black Widow first appear?",
            R.drawable.ic_blackwidow,
            "Iron Man",
            "Iron Man 2",
            "The Avengers",
            "Civil War",
            2
        )

        questionsList.add(que1)

        //question2

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2
        )

        questionsList.add(que2)

        //question3

        val que3 = Question(
            3,
            "Which Indian state has the most number of rivers ?",
            R.drawable.ic_river_india,
            "Bengal",
            "Bihar",
            "Madhya Pradesh",
            "Karnataka",
            3
        )

        questionsList.add(que3)

        //question4

        val que4 = Question(
            4,
            "This dish is famous for which country ?",
            R.drawable.ic_lasagna,
            "China",
            "Italy",
            "France",
            "London",
            2
        )

        questionsList.add(que4)

        //question5

        val que5 = Question(
            5,
            "Which constellation is shown in the image?",
            R.drawable.ic_ursa_major,
            "Cygnus",
            "Ursa Major",
            "Orion",
            "Lyra",
            2
        )

        questionsList.add(que5)

        //question6

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Australia",
            "Fiji",
            "Austria",
            3
        )

        questionsList.add(que6)

        //question7

        val que7 = Question(
            7,
            "What does 'R' in QRCode stands for ?",
            R.drawable.ic_qrcode,
            "reform",
            "response",
            "referral",
            "ring",
            2
        )

        questionsList.add(que7)

        //question8

        val que8 = Question(
            8,
            "Which country is famous for this monument ?",
            R.drawable.ic_the_louvre,
            "France",
            "India",
            "Sydney",
            "Denmark",
            1
        )

        questionsList.add(que8)

        //question9

        val que9 = Question(
            9,
            "Which Hogwarts House does the following image depict ?",
            R.drawable.ic_ravenclaw,
            "Helga Ravenclaw",
            "Rowena Ravenclaw",
            "Rudy Ravenclaw",
            "Riverina Ravenclaw",
            2
        )

        questionsList.add(que9)

        //question10

        val que10 = Question(
            10,
            "Which brand does this logo belong to ?",
            R.drawable.ic_nissan,
            "BMW",
            "Maruti Suzuki",
            "Nissan",
            "Ford",
            3
        )

        questionsList.add(que10)

        //question11

        val que11 = Question(
            11,
            "What country does this currency belong to?",
            R.drawable.ic_russian_currency,
            "France",
            "Russia",
            "England",
            "Denmark",
            2
        )

        questionsList.add(que11)

        //question12

        val que12 = Question(
            12,
            "Which is the largest state of India (area wise)?",
            R.drawable.ic_states_india,
            "Maharashtra",
            "Gujrat",
            "Rajasthan",
            "Madhya Pradesh",
            3
        )

        questionsList.add(que12)

        //question13

        val que13 = Question(
            13,
            "Which famous building is shown below ?",
            R.drawable.ic_leaningtower,
            "The Leaning Tower of Pisa",
            "The Big Ben",
            "Tiger Hill Pagoda",
            "Belfry of Bruges",
            1
        )

        questionsList.add(que13)

        //question14

        val que14 = Question(
            14,
            "Which house does Dolores Umbridge belong to ?",
            R.drawable.ic_slytherin,
            "Gryffindor",
            "Hufflepuff",
            "Ravenclaw",
            "Slytherin",
            4
        )

        questionsList.add(que14)

        //question15

        val que15 = Question(
            15,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_newzealand,
            "Denmark",
            "New Zealand",
            "America",
            "Austria",
            2
        )

        questionsList.add(que15)

        //question15

        val que16 = Question(
            16,
            "What does S.H.I.E.L.D originally stands for?",
            R.drawable.ic_shield,
            "Supreme Headquarters International Espionage Legal Enforcement Division",
            "Strategic Homeland Intervention Enforcement and Logistics Division",
            "Strategic Hazard Intervention Espionage Logistics Directorate",
            "Supreme Headquarters International Espionage Law Enforcement Division",
            4
        )

        questionsList.add(que16)

        //question17

        val que17 = Question(
            17,
            "This is the poster for which Web Television Series ",
            R.drawable.ic_lockeandkey,
            "Dark",
            "Punisher",
            "Titans",
            "Locke and Key",
            4
        )

        questionsList.add(que17)

        //question18

        val que18 = Question(
            18,
            "The Mahabharata is also described as ?",
            R.drawable.ic_mahabharata,
            "The struggle story",
            "The longest poem ever written",
            "Goals of life",
            "The war story",
            3
        )

        questionsList.add(que18)

        //question19

        val que19 = Question(
            19,
            "Where is this building located in the world?",
            R.drawable.ic_lotus_temple,
            "India",
            "Singapore",
            "France",
            "Sydney",
            1
        )

        questionsList.add(que19)

        //question20

        val que20 = Question(
            20,
            "What is the name of this prominent medal of India?",
            R.drawable.ic_virchakra,
            "Padma Bhushan",
            "Bharat Ratna",
            "Maha Vir Chakra",
            "Ashoka Chakra",
            3
        )

        questionsList.add(que20)
        return questionsList
    }

}