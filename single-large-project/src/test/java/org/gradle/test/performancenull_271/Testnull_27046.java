package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27046 {
    private final Productionnull_27046 production = new Productionnull_27046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}