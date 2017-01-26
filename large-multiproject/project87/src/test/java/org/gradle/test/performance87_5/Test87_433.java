package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_433 {
    private final Production87_433 production = new Production87_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}