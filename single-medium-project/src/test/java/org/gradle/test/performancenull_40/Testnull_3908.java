package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3908 {
    private final Productionnull_3908 production = new Productionnull_3908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}