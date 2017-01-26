package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_205 {
    private final Production4_205 production = new Production4_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}