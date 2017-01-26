package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40053 {
    private final Productionnull_40053 production = new Productionnull_40053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}