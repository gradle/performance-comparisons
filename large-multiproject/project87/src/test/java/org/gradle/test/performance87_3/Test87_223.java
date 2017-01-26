package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_223 {
    private final Production87_223 production = new Production87_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}