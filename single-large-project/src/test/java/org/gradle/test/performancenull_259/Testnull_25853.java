package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25853 {
    private final Productionnull_25853 production = new Productionnull_25853("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}