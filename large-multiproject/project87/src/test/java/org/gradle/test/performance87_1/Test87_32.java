package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_32 {
    private final Production87_32 production = new Production87_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}