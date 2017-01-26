package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1746 {
    private final Productionnull_1746 production = new Productionnull_1746("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}