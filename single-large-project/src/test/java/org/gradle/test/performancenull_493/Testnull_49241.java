package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49241 {
    private final Productionnull_49241 production = new Productionnull_49241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}