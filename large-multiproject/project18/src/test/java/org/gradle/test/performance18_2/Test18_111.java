package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_111 {
    private final Production18_111 production = new Production18_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}