package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_111 {
    private final Production22_111 production = new Production22_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}