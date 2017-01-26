package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24925 {
    private final Productionnull_24925 production = new Productionnull_24925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}