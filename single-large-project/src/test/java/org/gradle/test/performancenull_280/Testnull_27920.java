package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27920 {
    private final Productionnull_27920 production = new Productionnull_27920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}