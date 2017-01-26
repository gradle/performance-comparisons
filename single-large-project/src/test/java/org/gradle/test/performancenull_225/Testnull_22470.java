package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22470 {
    private final Productionnull_22470 production = new Productionnull_22470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}