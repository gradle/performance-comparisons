package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_22 {
    private final Production89_22 production = new Production89_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}