package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27076 {
    private final Productionnull_27076 production = new Productionnull_27076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}