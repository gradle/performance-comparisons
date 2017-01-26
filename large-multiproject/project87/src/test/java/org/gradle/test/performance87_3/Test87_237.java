package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_237 {
    private final Production87_237 production = new Production87_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}