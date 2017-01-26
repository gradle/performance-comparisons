package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25872 {
    private final Productionnull_25872 production = new Productionnull_25872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}