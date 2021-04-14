package com.rifdahalf.newsapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.rifdahalf.newsapp2.R
import com.rifdahalf.newsapp2.model.Article
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NEWS = "extra_news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()
        fb_back.setOnClickListener { startActivity(Intent(MainActivity.getLaunchService(this))) }
        val news = intent.getParcelableExtra<Article>("EXTRA_NEWS") as Article
        Glide.with(this).load(news.urlToImage).into(iv_detail)
        tv_title_detail.text = news.title.toString()
        tv_author_detail.text = news.author.toString()
        tv_date_detail.text = news.publishedAt.toString()
        tv_desc_detail.text = news.description.toString()
        tv_content_detail.text = news.content.toString()
    }
}