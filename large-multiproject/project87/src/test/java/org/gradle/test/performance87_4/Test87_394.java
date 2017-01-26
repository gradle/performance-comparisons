package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_394 {
    private final Production87_394 production = new Production87_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}