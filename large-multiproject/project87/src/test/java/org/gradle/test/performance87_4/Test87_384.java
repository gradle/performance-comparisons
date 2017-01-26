package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_384 {
    private final Production87_384 production = new Production87_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}