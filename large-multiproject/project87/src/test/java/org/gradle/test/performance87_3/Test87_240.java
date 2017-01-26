package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_240 {
    private final Production87_240 production = new Production87_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}