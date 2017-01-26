package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21647 {
    private final Productionnull_21647 production = new Productionnull_21647("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}