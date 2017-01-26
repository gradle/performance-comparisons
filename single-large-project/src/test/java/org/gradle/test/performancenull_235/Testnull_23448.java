package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23448 {
    private final Productionnull_23448 production = new Productionnull_23448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}