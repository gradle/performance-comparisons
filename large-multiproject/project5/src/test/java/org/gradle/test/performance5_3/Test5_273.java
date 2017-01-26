package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_273 {
    private final Production5_273 production = new Production5_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}