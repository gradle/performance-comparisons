package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_141 {
    private final Production87_141 production = new Production87_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}