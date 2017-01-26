package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21896 {
    private final Productionnull_21896 production = new Productionnull_21896("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}