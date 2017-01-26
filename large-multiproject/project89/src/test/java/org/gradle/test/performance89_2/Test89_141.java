package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_141 {
    private final Production89_141 production = new Production89_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}