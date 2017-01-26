package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_111 {
    private final Production54_111 production = new Production54_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}