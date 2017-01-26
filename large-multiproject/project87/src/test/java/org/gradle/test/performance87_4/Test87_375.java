package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_375 {
    private final Production87_375 production = new Production87_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}