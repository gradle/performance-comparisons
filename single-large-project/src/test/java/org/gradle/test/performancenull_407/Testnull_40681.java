package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40681 {
    private final Productionnull_40681 production = new Productionnull_40681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}