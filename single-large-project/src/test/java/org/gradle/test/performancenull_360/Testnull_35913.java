package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35913 {
    private final Productionnull_35913 production = new Productionnull_35913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}