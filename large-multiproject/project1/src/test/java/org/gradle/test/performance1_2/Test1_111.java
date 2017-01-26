package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_111 {
    private final Production1_111 production = new Production1_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}