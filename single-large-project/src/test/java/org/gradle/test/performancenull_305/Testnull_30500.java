package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30500 {
    private final Productionnull_30500 production = new Productionnull_30500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}