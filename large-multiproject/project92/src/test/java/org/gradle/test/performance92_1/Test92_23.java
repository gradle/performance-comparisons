package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_23 {
    private final Production92_23 production = new Production92_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}