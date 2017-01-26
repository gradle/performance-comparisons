package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_269 {
    private final Production6_269 production = new Production6_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}