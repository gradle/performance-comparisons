package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_376 {
    private final Production87_376 production = new Production87_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}