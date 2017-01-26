package org.gradle.test.performancenull_458;

import static org.junit.Assert.*;

public class Testnull_45790 {
    private final Productionnull_45790 production = new Productionnull_45790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}