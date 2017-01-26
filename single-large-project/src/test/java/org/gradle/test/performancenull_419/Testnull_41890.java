package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41890 {
    private final Productionnull_41890 production = new Productionnull_41890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}