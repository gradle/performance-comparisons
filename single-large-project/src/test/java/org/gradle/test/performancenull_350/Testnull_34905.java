package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34905 {
    private final Productionnull_34905 production = new Productionnull_34905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}