package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_177 {
    private final Production87_177 production = new Production87_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}