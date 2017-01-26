package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41126 {
    private final Productionnull_41126 production = new Productionnull_41126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}