package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11842 {
    private final Productionnull_11842 production = new Productionnull_11842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}