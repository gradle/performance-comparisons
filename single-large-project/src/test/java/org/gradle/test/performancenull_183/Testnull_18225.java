package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18225 {
    private final Productionnull_18225 production = new Productionnull_18225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}