package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3981 {
    private final Productionnull_3981 production = new Productionnull_3981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}