package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27985 {
    private final Productionnull_27985 production = new Productionnull_27985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}