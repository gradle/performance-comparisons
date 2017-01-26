package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_402 {
    private final Production30_402 production = new Production30_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}