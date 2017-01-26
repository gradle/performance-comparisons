package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3462 {
    private final Productionnull_3462 production = new Productionnull_3462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}