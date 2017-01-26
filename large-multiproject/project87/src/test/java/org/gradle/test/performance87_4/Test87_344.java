package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_344 {
    private final Production87_344 production = new Production87_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}