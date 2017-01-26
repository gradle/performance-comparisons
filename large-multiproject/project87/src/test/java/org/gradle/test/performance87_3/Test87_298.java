package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_298 {
    private final Production87_298 production = new Production87_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}