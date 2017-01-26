package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27401 {
    private final Productionnull_27401 production = new Productionnull_27401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}