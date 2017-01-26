package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25824 {
    private final Productionnull_25824 production = new Productionnull_25824("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}