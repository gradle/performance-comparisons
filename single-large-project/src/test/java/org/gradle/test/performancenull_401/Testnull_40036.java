package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40036 {
    private final Productionnull_40036 production = new Productionnull_40036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}