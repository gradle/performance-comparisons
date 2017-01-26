package org.gradle.test.performancenull_109;

import static org.junit.Assert.*;

public class Testnull_10842 {
    private final Productionnull_10842 production = new Productionnull_10842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}