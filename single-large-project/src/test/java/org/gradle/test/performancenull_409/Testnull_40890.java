package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40890 {
    private final Productionnull_40890 production = new Productionnull_40890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}