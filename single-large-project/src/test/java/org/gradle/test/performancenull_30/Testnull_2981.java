package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2981 {
    private final Productionnull_2981 production = new Productionnull_2981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}