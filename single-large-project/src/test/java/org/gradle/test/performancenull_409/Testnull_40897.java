package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40897 {
    private final Productionnull_40897 production = new Productionnull_40897("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}