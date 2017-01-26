package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_23 {
    private final Production14_23 production = new Production14_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}