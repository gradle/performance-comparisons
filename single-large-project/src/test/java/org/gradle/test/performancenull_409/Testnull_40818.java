package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40818 {
    private final Productionnull_40818 production = new Productionnull_40818("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}