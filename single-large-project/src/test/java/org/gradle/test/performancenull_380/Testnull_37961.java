package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37961 {
    private final Productionnull_37961 production = new Productionnull_37961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}