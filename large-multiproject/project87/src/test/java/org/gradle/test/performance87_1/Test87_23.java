package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_23 {
    private final Production87_23 production = new Production87_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}