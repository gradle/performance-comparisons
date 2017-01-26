package org.gradle.test.performancenull_184;

import static org.junit.Assert.*;

public class Testnull_18309 {
    private final Productionnull_18309 production = new Productionnull_18309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}