package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_111 {
    private final Production25_111 production = new Production25_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}