package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_245 {
    private final Production87_245 production = new Production87_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}