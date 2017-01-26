package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_111 {
    private final Production30_111 production = new Production30_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}