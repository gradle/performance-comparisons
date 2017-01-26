package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_489 {
    private final Production87_489 production = new Production87_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}