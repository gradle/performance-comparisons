package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21984 {
    private final Productionnull_21984 production = new Productionnull_21984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}