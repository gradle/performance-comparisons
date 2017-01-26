package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_312 {
    private final Production87_312 production = new Production87_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}