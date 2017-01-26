package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35903 {
    private final Productionnull_35903 production = new Productionnull_35903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}