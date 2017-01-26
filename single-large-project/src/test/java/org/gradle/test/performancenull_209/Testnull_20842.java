package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20842 {
    private final Productionnull_20842 production = new Productionnull_20842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}