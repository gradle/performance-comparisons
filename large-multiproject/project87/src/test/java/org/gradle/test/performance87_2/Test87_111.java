package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_111 {
    private final Production87_111 production = new Production87_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}