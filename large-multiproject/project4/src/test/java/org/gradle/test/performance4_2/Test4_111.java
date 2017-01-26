package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_111 {
    private final Production4_111 production = new Production4_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}