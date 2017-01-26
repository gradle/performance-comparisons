package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_402 {
    private final Production87_402 production = new Production87_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}