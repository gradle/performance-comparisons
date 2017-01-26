package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_273 {
    private final Production87_273 production = new Production87_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}