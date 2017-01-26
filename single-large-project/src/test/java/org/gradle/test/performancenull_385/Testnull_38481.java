package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38481 {
    private final Productionnull_38481 production = new Productionnull_38481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}