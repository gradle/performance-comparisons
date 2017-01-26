package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_197 {
    private final Production87_197 production = new Production87_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}