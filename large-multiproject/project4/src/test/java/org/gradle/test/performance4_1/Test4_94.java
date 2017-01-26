package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_94 {
    private final Production4_94 production = new Production4_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}