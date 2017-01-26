package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_111 {
    private final Production10_111 production = new Production10_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}