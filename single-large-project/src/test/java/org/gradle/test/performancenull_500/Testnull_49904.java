package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49904 {
    private final Productionnull_49904 production = new Productionnull_49904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}