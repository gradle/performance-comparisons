package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36935 {
    private final Productionnull_36935 production = new Productionnull_36935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}