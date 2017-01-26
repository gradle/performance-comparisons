package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_318 {
    private final Production87_318 production = new Production87_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}