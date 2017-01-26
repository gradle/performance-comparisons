package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_23 {
    private final Production5_23 production = new Production5_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}