package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27060 {
    private final Productionnull_27060 production = new Productionnull_27060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}