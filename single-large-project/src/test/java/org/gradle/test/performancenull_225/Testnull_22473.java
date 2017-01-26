package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22473 {
    private final Productionnull_22473 production = new Productionnull_22473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}