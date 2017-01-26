package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_111 {
    private final Production31_111 production = new Production31_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}