package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_473 {
    private final Production87_473 production = new Production87_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}