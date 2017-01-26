package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_111 {
    private final Production55_111 production = new Production55_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}