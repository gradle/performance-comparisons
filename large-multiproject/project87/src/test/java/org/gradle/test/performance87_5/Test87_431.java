package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_431 {
    private final Production87_431 production = new Production87_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}