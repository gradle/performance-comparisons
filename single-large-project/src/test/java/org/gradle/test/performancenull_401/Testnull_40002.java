package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40002 {
    private final Productionnull_40002 production = new Productionnull_40002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}