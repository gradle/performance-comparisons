package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_111 {
    private final Production83_111 production = new Production83_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}