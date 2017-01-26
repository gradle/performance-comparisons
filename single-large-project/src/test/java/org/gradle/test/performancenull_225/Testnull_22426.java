package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22426 {
    private final Productionnull_22426 production = new Productionnull_22426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}