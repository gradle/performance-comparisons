package org.gradle.test.performancenull_388;

import static org.junit.Assert.*;

public class Testnull_38790 {
    private final Productionnull_38790 production = new Productionnull_38790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}