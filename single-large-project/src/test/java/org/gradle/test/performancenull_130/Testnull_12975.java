package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12975 {
    private final Productionnull_12975 production = new Productionnull_12975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}