package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_223 {
    private final Production7_223 production = new Production7_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}