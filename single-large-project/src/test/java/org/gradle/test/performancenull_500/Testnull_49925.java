package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49925 {
    private final Productionnull_49925 production = new Productionnull_49925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}