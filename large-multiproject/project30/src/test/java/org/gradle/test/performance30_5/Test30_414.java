package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_414 {
    private final Production30_414 production = new Production30_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}