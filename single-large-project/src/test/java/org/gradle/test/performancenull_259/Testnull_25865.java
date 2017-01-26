package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25865 {
    private final Productionnull_25865 production = new Productionnull_25865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}