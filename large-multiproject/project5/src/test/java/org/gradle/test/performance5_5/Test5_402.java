package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_402 {
    private final Production5_402 production = new Production5_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}