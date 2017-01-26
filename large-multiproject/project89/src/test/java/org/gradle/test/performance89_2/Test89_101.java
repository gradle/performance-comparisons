package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_101 {
    private final Production89_101 production = new Production89_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}