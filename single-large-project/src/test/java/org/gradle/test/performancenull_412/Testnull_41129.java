package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41129 {
    private final Productionnull_41129 production = new Productionnull_41129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}