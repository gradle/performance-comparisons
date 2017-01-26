package org.gradle.test.performancenull_237;

import static org.junit.Assert.*;

public class Testnull_23641 {
    private final Productionnull_23641 production = new Productionnull_23641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}