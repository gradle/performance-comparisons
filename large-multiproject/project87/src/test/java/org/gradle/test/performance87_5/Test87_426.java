package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_426 {
    private final Production87_426 production = new Production87_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}