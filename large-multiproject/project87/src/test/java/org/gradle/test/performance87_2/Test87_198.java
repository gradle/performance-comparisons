package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_198 {
    private final Production87_198 production = new Production87_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}