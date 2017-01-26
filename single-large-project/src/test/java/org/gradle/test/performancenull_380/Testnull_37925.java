package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37925 {
    private final Productionnull_37925 production = new Productionnull_37925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}