package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_94 {
    private final Production89_94 production = new Production89_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}