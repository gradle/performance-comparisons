package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_299 {
    private final Production20_299 production = new Production20_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}