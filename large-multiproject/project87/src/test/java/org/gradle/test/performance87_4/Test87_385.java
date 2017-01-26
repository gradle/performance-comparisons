package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_385 {
    private final Production87_385 production = new Production87_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}