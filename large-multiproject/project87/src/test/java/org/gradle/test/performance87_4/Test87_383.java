package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_383 {
    private final Production87_383 production = new Production87_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}