package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30052 {
    private final Productionnull_30052 production = new Productionnull_30052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}