package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_101 {
    private final Production87_101 production = new Production87_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}