package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40061 {
    private final Productionnull_40061 production = new Productionnull_40061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}