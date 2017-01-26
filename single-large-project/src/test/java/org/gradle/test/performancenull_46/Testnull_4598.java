package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4598 {
    private final Productionnull_4598 production = new Productionnull_4598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}