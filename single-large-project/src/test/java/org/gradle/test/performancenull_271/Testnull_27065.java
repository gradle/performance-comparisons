package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27065 {
    private final Productionnull_27065 production = new Productionnull_27065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}