package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_111 {
    private final Production89_111 production = new Production89_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}