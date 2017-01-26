package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3919 {
    private final Productionnull_3919 production = new Productionnull_3919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}