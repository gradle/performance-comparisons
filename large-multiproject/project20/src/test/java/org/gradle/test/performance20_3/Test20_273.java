package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_273 {
    private final Production20_273 production = new Production20_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}