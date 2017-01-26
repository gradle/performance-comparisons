package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32472 {
    private final Productionnull_32472 production = new Productionnull_32472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}