package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20168 {
    private final Productionnull_20168 production = new Productionnull_20168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}