package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24986 {
    private final Productionnull_24986 production = new Productionnull_24986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}