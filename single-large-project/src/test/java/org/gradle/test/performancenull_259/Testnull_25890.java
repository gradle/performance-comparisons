package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25890 {
    private final Productionnull_25890 production = new Productionnull_25890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}