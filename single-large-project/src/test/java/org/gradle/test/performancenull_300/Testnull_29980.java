package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29980 {
    private final Productionnull_29980 production = new Productionnull_29980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}