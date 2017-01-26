package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_370 {
    private final Production87_370 production = new Production87_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}