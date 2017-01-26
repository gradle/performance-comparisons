package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25060 {
    private final Productionnull_25060 production = new Productionnull_25060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}