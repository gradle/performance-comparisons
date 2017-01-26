package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_205 {
    private final Production89_205 production = new Production89_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}