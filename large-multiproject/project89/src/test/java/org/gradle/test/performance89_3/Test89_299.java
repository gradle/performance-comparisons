package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_299 {
    private final Production89_299 production = new Production89_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}