package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_463 {
    private final Production87_463 production = new Production87_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}