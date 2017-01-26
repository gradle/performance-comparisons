package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40022 {
    private final Productionnull_40022 production = new Productionnull_40022("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}