package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30865 {
    private final Productionnull_30865 production = new Productionnull_30865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}