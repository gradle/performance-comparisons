package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13082 {
    private final Productionnull_13082 production = new Productionnull_13082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}