package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25892 {
    private final Productionnull_25892 production = new Productionnull_25892("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}