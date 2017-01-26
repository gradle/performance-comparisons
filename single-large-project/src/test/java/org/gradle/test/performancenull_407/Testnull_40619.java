package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40619 {
    private final Productionnull_40619 production = new Productionnull_40619("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}