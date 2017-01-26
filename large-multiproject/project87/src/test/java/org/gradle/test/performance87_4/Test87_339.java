package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_339 {
    private final Production87_339 production = new Production87_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}