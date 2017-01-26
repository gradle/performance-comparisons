package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_21 {
    private final Production87_21 production = new Production87_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}