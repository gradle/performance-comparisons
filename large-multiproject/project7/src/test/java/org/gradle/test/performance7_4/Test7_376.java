package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_376 {
    private final Production7_376 production = new Production7_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}