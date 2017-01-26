package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_414 {
    private final Production7_414 production = new Production7_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}