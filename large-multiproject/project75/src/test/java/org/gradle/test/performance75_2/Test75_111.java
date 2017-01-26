package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_111 {
    private final Production75_111 production = new Production75_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}