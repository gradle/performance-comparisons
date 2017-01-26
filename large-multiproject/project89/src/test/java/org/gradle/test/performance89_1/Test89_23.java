package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_23 {
    private final Production89_23 production = new Production89_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}