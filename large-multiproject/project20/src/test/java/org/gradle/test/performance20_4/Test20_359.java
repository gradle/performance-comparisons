package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_359 {
    private final Production20_359 production = new Production20_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}