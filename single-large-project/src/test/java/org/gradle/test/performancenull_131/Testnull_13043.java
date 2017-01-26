package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13043 {
    private final Productionnull_13043 production = new Productionnull_13043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}