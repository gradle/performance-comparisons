package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_86 {
    private final Production87_86 production = new Production87_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}