package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_299 {
    private final Production92_299 production = new Production92_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}