package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_359 {
    private final Production87_359 production = new Production87_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}