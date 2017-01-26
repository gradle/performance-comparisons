package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_111 {
    private final Production98_111 production = new Production98_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}