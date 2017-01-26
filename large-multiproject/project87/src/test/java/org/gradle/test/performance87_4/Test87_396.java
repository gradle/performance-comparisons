package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_396 {
    private final Production87_396 production = new Production87_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}