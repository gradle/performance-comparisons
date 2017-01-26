package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40896 {
    private final Productionnull_40896 production = new Productionnull_40896("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}