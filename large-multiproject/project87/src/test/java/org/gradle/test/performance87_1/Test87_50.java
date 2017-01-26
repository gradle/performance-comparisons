package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_50 {
    private final Production87_50 production = new Production87_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}