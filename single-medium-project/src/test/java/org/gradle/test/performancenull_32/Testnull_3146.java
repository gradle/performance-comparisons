package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3146 {
    private final Productionnull_3146 production = new Productionnull_3146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}