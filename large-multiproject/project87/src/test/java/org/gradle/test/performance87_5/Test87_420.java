package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_420 {
    private final Production87_420 production = new Production87_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}