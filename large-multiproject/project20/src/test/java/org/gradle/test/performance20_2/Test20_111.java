package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_111 {
    private final Production20_111 production = new Production20_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}