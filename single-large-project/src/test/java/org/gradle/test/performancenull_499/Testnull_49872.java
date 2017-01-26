package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49872 {
    private final Productionnull_49872 production = new Productionnull_49872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}