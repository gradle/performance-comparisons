package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40043 {
    private final Productionnull_40043 production = new Productionnull_40043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}