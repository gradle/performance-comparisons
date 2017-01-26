package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27979 {
    private final Productionnull_27979 production = new Productionnull_27979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}