package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_194 {
    private final Production87_194 production = new Production87_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}