package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40673 {
    private final Productionnull_40673 production = new Productionnull_40673("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}