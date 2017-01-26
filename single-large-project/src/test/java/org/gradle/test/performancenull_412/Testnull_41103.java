package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41103 {
    private final Productionnull_41103 production = new Productionnull_41103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}