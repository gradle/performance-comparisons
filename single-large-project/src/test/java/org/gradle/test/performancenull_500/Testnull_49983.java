package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49983 {
    private final Productionnull_49983 production = new Productionnull_49983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}