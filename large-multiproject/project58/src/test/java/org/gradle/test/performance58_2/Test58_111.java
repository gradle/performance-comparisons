package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_111 {
    private final Production58_111 production = new Production58_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}