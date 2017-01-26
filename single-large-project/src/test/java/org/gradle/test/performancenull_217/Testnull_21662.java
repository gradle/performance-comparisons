package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21662 {
    private final Productionnull_21662 production = new Productionnull_21662("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}