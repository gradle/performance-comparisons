package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_11 {
    private final Production87_11 production = new Production87_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}