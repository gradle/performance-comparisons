package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25842 {
    private final Productionnull_25842 production = new Productionnull_25842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}