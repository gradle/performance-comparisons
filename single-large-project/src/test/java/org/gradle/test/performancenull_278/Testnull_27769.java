package org.gradle.test.performancenull_278;

import static org.junit.Assert.*;

public class Testnull_27769 {
    private final Productionnull_27769 production = new Productionnull_27769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}