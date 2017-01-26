package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22401 {
    private final Productionnull_22401 production = new Productionnull_22401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}