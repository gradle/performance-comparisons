package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_179 {
    private final Production89_179 production = new Production89_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}