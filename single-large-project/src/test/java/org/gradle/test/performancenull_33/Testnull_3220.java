package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3220 {
    private final Productionnull_3220 production = new Productionnull_3220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}