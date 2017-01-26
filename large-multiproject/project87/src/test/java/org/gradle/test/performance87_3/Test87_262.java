package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_262 {
    private final Production87_262 production = new Production87_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}