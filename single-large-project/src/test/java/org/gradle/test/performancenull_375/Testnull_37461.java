package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37461 {
    private final Productionnull_37461 production = new Productionnull_37461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}