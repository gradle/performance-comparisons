package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_355 {
    private final Production87_355 production = new Production87_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}