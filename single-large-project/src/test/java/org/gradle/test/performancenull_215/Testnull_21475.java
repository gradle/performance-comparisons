package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21475 {
    private final Productionnull_21475 production = new Productionnull_21475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}