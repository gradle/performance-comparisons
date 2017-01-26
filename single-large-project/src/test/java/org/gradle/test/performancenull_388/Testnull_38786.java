package org.gradle.test.performancenull_388;

import static org.junit.Assert.*;

public class Testnull_38786 {
    private final Productionnull_38786 production = new Productionnull_38786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}