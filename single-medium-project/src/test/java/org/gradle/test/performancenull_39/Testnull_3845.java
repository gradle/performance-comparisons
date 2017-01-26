package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3845 {
    private final Productionnull_3845 production = new Productionnull_3845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}