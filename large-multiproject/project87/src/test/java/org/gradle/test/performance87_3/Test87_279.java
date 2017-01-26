package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_279 {
    private final Production87_279 production = new Production87_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}