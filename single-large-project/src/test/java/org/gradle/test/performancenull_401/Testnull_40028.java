package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40028 {
    private final Productionnull_40028 production = new Productionnull_40028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}