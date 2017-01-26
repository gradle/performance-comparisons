package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_478 {
    private final Production30_478 production = new Production30_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}