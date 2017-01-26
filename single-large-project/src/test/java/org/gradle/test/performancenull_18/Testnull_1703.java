package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1703 {
    private final Productionnull_1703 production = new Productionnull_1703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}