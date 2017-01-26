package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37220 {
    private final Productionnull_37220 production = new Productionnull_37220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}