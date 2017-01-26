package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21649 {
    private final Productionnull_21649 production = new Productionnull_21649("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}