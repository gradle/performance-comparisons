package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40042 {
    private final Productionnull_40042 production = new Productionnull_40042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}