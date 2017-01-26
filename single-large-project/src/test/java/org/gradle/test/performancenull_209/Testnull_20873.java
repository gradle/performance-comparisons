package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20873 {
    private final Productionnull_20873 production = new Productionnull_20873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}