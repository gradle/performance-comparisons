package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_448 {
    private final Production87_448 production = new Production87_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}