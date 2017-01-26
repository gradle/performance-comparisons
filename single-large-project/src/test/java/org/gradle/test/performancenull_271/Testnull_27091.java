package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27091 {
    private final Productionnull_27091 production = new Productionnull_27091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}