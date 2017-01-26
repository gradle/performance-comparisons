package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_252 {
    private final Production87_252 production = new Production87_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}