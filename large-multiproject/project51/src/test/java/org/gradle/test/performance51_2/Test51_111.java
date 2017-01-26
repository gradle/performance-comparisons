package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_111 {
    private final Production51_111 production = new Production51_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}