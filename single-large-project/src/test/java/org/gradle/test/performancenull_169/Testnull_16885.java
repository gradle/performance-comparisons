package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16885 {
    private final Productionnull_16885 production = new Productionnull_16885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}