package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_232 {
    private final Production87_232 production = new Production87_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}