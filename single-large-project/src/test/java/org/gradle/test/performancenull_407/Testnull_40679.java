package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40679 {
    private final Productionnull_40679 production = new Productionnull_40679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}