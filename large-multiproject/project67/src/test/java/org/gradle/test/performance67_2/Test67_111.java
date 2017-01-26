package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_111 {
    private final Production67_111 production = new Production67_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}