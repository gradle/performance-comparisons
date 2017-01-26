package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_376 {
    private final Production30_376 production = new Production30_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}