package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25825 {
    private final Productionnull_25825 production = new Productionnull_25825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}