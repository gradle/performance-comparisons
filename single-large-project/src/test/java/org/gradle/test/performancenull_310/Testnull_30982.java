package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30982 {
    private final Productionnull_30982 production = new Productionnull_30982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}