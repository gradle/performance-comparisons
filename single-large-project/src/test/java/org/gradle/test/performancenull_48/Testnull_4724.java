package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4724 {
    private final Productionnull_4724 production = new Productionnull_4724("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}