package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40865 {
    private final Productionnull_40865 production = new Productionnull_40865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}