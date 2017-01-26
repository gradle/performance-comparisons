package org.gradle.test.performancenull_273;

import static org.junit.Assert.*;

public class Testnull_27270 {
    private final Productionnull_27270 production = new Productionnull_27270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}