package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38467 {
    private final Productionnull_38467 production = new Productionnull_38467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}