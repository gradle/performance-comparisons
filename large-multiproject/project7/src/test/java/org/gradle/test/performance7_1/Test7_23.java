package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_23 {
    private final Production7_23 production = new Production7_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}