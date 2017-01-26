package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40889 {
    private final Productionnull_40889 production = new Productionnull_40889("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}