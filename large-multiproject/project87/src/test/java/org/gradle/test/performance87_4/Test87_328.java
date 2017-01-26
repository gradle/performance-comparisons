package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_328 {
    private final Production87_328 production = new Production87_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}