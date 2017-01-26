package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_132 {
    private final Production87_132 production = new Production87_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}