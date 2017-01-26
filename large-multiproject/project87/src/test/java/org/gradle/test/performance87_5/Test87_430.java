package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_430 {
    private final Production87_430 production = new Production87_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}