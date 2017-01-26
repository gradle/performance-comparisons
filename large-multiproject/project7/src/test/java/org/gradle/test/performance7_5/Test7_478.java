package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_478 {
    private final Production7_478 production = new Production7_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}