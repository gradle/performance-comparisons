package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35531 {
    private final Productionnull_35531 production = new Productionnull_35531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}