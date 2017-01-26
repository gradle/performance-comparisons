package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_132 {
    private final Production20_132 production = new Production20_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}