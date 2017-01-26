package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_223 {
    private final Production30_223 production = new Production30_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}