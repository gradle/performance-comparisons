package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_23 {
    private final Production20_23 production = new Production20_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}