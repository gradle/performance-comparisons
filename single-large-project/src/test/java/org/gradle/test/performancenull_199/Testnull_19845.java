package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19845 {
    private final Productionnull_19845 production = new Productionnull_19845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}