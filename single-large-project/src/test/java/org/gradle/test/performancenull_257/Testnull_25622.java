package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25622 {
    private final Productionnull_25622 production = new Productionnull_25622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}