package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_223 {
    private final Production20_223 production = new Production20_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}