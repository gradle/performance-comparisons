package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_451 {
    private final Production87_451 production = new Production87_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}