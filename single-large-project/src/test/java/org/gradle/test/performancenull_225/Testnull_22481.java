package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22481 {
    private final Productionnull_22481 production = new Productionnull_22481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}