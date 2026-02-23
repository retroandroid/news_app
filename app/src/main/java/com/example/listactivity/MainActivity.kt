package com.example.listactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)

        val newsList = listOf(
            News(
                source = "GameSpotlight",
                title = "Big studios double down on cross-platform releases",
                description = "More publishers are launching on PC and console at the same time to reach wider audiences.",
                time = "1h",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Patch Notes",
                title = "Major update boosts performance and fixes matchmaking issues",
                description = "Players report smoother framerates and faster queue times after the latest patch.",
                time = "5h",
                imageResId = R.drawable.news2
            ),
            News(
                source = "Indie Radar",
                title = "Indie roguelites keep evolving with deeper meta-progression",
                description = "New releases focus on build variety, procedural levels, and long-term unlock systems.",
                time = "10h",
                imageResId = R.drawable.news3
            ),

            News(
                source = "Esports Brief",
                title = "Tournament season ramps up with new formats",
                description = "Organizers are experimenting with shorter brackets and more international qualifiers.",
                time = "12h",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Hardware Hub",
                title = "Handheld gaming PCs chase better battery life",
                description = "New tuning profiles aim to balance performance, heat, and portability.",
                time = "14h",
                imageResId = R.drawable.news2
            ),
            News(
                source = "Studio Watch",
                title = "More studios adopt public roadmaps for transparency",
                description = "Teams share upcoming features and bug priorities to manage expectations.",
                time = "16h",
                imageResId = R.drawable.news3
            ),
            News(
                source = "Game Design Weekly",
                title = "Build-crafting stays king in action games",
                description = "Players love mixing synergies, stacking modifiers, and experimenting with weird combos.",
                time = "18h",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Multiplayer Today",
                title = "Ranked modes add smarter anti-smurf systems",
                description = "Matchmaking is getting better at detecting skill gaps and new account abuse.",
                time = "20h",
                imageResId = R.drawable.news2
            ),
            News(
                source = "Indie Radar",
                title = "Cozy games keep trending with new life-sim twists",
                description = "Small studios focus on vibe, progression loops, and low-stress goals.",
                time = "22h",
                imageResId = R.drawable.news3
            ),
            News(
                source = "Patch Notes",
                title = "Balance pass targets ‘must-pick’ items and overpowered builds",
                description = "Developers tweak the meta by nerfing outliers and buffing underused choices.",
                time = "1d",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Community Pulse",
                title = "Mods extend replayability with new maps and challenges",
                description = "Community-made content adds fresh objectives and quality-of-life improvements.",
                time = "1d",
                imageResId = R.drawable.news2
            ),
            News(
                source = "Streaming Feed",
                title = "Streamers push more challenge runs and ‘ironman’ rulesets",
                description = "Self-imposed restrictions are becoming a big way to keep games exciting.",
                time = "1d",
                imageResId = R.drawable.news3
            ),
            News(
                source = "Hardware Hub",
                title = "Monitors lean harder into high refresh + lower latency",
                description = "Competitive players prioritize smooth motion and fast response over resolution.",
                time = "2d",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Esports Brief",
                title = "Teams invest more in coaching and analytics",
                description = "Strategy, scouting, and review sessions are becoming just as important as mechanics.",
                time = "2d",
                imageResId = R.drawable.news2
            ),
            News(
                source = "Studio Watch",
                title = "Early access remains popular for community-driven development",
                description = "Studios iterate in public to refine gameplay loops and fix priorities faster.",
                time = "2d",
                imageResId = R.drawable.news3
            ),
            News(
                source = "Game Design Weekly",
                title = "Accessibility options become standard expectations",
                description = "More games ship with better UI scaling, subtitles, color filters, and remappable controls.",
                time = "3d",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Multiplayer Today",
                title = "Co-op experiences get more drop-in friendly",
                description = "Session-based co-op is focusing on quick joins, fast restarts, and shared progression.",
                time = "3d",
                imageResId = R.drawable.news2
            ),
            News(
                source = "Indie Radar",
                title = "Pixel art is still undefeated for readable action",
                description = "Stylized visuals + clear silhouettes make gameplay easier to read at speed.",
                time = "3d",
                imageResId = R.drawable.news3
            ),
            News(
                source = "Community Pulse",
                title = "Players want fewer battle passes and more permanent unlocks",
                description = "The trend is shifting toward progression that doesn’t expire or punish breaks.",
                time = "4d",
                imageResId = R.drawable.news1
            ),
            News(
                source = "Patch Notes",
                title = "UI cleanup improves inventory and loadout management",
                description = "Less clutter, better sorting, and faster navigation—small change, huge quality boost.",
                time = "4d",
                imageResId = R.drawable.news2
            )
        )

        rv.adapter = NewsAdapter(newsList)
    }
}