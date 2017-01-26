package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25681 {
    private final Productionnull_25681 production = new Productionnull_25681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}