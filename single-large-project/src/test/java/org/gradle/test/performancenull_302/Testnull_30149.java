package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30149 {
    private final Productionnull_30149 production = new Productionnull_30149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}