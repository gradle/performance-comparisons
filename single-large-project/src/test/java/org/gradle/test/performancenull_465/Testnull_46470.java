package org.gradle.test.performancenull_465;

import static org.junit.Assert.*;

public class Testnull_46470 {
    private final Productionnull_46470 production = new Productionnull_46470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}