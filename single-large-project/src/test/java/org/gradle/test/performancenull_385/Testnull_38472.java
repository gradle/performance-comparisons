package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38472 {
    private final Productionnull_38472 production = new Productionnull_38472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}