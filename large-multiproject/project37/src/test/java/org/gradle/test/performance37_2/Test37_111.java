package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_111 {
    private final Production37_111 production = new Production37_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}