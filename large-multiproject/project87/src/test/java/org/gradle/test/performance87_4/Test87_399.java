package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_399 {
    private final Production87_399 production = new Production87_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}