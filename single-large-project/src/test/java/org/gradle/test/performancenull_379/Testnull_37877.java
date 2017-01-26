package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37877 {
    private final Productionnull_37877 production = new Productionnull_37877("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}