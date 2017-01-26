package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_179 {
    private final Production87_179 production = new Production87_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}