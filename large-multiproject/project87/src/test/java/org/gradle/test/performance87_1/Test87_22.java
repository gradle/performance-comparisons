package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_22 {
    private final Production87_22 production = new Production87_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}