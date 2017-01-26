package org.gradle.test.performancenull_47;

import static org.junit.Assert.*;

public class Testnull_4603 {
    private final Productionnull_4603 production = new Productionnull_4603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}