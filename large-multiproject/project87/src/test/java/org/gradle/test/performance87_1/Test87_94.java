package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_94 {
    private final Production87_94 production = new Production87_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}