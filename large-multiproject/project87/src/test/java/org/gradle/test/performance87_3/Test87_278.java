package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_278 {
    private final Production87_278 production = new Production87_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}