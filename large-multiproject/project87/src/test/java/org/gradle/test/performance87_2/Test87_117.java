package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_117 {
    private final Production87_117 production = new Production87_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}