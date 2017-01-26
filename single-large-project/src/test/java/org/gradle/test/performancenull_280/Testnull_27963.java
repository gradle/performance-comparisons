package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27963 {
    private final Productionnull_27963 production = new Productionnull_27963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}