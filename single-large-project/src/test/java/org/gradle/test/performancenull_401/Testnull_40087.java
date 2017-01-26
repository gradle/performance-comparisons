package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40087 {
    private final Productionnull_40087 production = new Productionnull_40087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}