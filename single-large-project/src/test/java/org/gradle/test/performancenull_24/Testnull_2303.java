package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2303 {
    private final Productionnull_2303 production = new Productionnull_2303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}