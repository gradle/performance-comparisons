package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_299 {
    private final Production5_299 production = new Production5_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}