package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19904 {
    private final Productionnull_19904 production = new Productionnull_19904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}