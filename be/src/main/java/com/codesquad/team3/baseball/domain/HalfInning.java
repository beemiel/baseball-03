package com.codesquad.team3.baseball.domain;

public class HalfInning {
    private Integer id;
    private int inning;
    private boolean isTop;
    private int score;
    private int strike;
    private int ball;
    private int out;
    private boolean first;
    private boolean second;
    private boolean third;
    private boolean home;

    public HalfInning(Integer id, int inning, boolean isTop) {
        this.id = id;
        this.inning = inning;
        this.isTop = isTop;
    }

    public HalfInning(Builder builder) {
        this.id = builder.id;
        this.inning = builder.inning;
        this.isTop = builder.isTop;
        this.score = builder.score;
        this.strike = builder.strike;
        this.ball = builder.ball;
        this.out = builder.out;
        this.first = builder.first;
        this.second = builder.second;
        this.third = builder.third;
        this.home = builder.home;
    }

    public int addScore(){
        return this.score++;
    }

    public int addStrike(){
        return this.strike++;
    }

    public int initStrike() {
        return this.strike = 0;
    }

    public int addBall(){
        return this.ball++;
    }

    public int initBall() {
        return this.ball = 0;
    }

    public int addOut(){
        return this.out++;
    }

    public int initOut() {
        return this.out = 0;
    }

    public boolean turnFirst(boolean status) {
        return this.first = status;
    }

    public boolean turnSecond(boolean status) {
        return this.second = status;
    }

    public boolean turnThird(boolean status) {
        return this.third = status;
    }

    @Override
    public String toString() {
        return "HalfInning{" +
                "id=" + id +
                ", inning=" + inning +
                ", isTop=" + isTop +
                ", score=" + score +
                ", strike=" + strike +
                ", ball=" + ball +
                ", out=" + out +
                ", first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public static class Builder {

        private Integer id;
        private int inning;
        private boolean isTop;
        private int score;
        private int strike;
        private int ball;
        private int out;
        private boolean first;
        private boolean second;
        private boolean third;
        private boolean home;

        public Builder(Integer id) {
            this.id = id;
        }

        public Builder inning(int inning) {
            this.inning = inning;
            return this;
        }

        public Builder isTop(boolean isTop) {
            this.isTop = isTop;
            return this;
        }

        public Builder score(int score) {
            this.score = score;
            return this;
        }

        public Builder strike(int strike) {
            this.strike = strike;
            return this;
        }

        public Builder ball(int ball) {
            this.ball = ball;
            return this;
        }

        public Builder out(int out) {
            this.out = out;
            return this;
        }

        public Builder first(boolean first) {
            this.first = first;
            return this;
        }

        public Builder second(boolean second) {
            this.second = second;
            return this;
        }

        public Builder third(boolean third) {
            this.third = third;
            return this;
        }

        public Builder home(boolean home) {
            this.home = home;
            return this;
        }

        public HalfInning build() {
            return new HalfInning(this);
        }
    }
}
