package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30456 {
    private final Productionnull_30456 production = new Productionnull_30456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}