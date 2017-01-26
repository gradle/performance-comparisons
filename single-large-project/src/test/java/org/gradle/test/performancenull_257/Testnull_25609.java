package org.gradle.test.performancenull_257;

import static org.junit.Assert.*;

public class Testnull_25609 {
    private final Productionnull_25609 production = new Productionnull_25609("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}