package org.gradle.test.performancenull_132;

import static org.junit.Assert.*;

public class Testnull_13190 {
    private final Productionnull_13190 production = new Productionnull_13190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}