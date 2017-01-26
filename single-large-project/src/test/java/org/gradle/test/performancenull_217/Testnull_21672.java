package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21672 {
    private final Productionnull_21672 production = new Productionnull_21672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}