package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_121 {
    private final Production87_121 production = new Production87_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}