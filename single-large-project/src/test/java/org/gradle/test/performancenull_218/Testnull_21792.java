package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21792 {
    private final Productionnull_21792 production = new Productionnull_21792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}