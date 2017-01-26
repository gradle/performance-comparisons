package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_111 {
    private final Production14_111 production = new Production14_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}