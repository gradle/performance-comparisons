package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_459 {
    private final Production87_459 production = new Production87_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}