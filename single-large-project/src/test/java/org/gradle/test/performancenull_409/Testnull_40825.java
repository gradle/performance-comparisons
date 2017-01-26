package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40825 {
    private final Productionnull_40825 production = new Productionnull_40825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}