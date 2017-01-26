package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_57 {
    private final Production87_57 production = new Production87_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}