package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42443 {
    private final Productionnull_42443 production = new Productionnull_42443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}