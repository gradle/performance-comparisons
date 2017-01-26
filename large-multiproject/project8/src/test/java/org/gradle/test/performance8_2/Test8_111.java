package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_111 {
    private final Production8_111 production = new Production8_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}