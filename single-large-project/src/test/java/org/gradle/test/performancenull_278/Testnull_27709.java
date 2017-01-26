package org.gradle.test.performancenull_278;

import static org.junit.Assert.*;

public class Testnull_27709 {
    private final Productionnull_27709 production = new Productionnull_27709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}