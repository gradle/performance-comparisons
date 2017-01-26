package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5473 {
    private final Productionnull_5473 production = new Productionnull_5473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}