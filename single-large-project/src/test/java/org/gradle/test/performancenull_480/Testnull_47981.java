package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47981 {
    private final Productionnull_47981 production = new Productionnull_47981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}