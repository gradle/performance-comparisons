package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_335 {
    private final Production87_335 production = new Production87_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}