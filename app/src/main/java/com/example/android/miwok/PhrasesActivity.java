/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //array of words
        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("Where are you going?", "lutti"));
        words.add(new Word("What is your name?", "lutti2"));
        words.add(new Word("My name is...", "lutti3"));
        words.add(new Word("How are you feeling?", "lutti4"));
        words.add(new Word("I’m feeling good.", "lutti5"));

        words.add(new Word("I’m feeling good.", "lutti6"));
        words.add(new Word("I’m feeling good.", "lutti7"));
        words.add(new Word("I’m feeling good.", "lutti8"));
        words.add(new Word("I’m feeling good.", "lutti9"));
        words.add(new Word("I’m feeling good.", "lutti10"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
