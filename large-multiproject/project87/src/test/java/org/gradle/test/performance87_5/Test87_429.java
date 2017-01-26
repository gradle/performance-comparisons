package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_429 {
    private final Production87_429 production = new Production87_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}