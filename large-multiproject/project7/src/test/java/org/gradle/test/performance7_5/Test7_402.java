package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_402 {
    private final Production7_402 production = new Production7_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}