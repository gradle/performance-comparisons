package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_153 {
    private final Production87_153 production = new Production87_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}