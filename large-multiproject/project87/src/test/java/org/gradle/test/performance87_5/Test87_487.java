package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_487 {
    private final Production87_487 production = new Production87_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}