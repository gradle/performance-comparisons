package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49061 {
    private final Productionnull_49061 production = new Productionnull_49061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}