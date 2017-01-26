package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25838 {
    private final Productionnull_25838 production = new Productionnull_25838("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}