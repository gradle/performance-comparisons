package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18773 {
    private final Productionnull_18773 production = new Productionnull_18773("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}