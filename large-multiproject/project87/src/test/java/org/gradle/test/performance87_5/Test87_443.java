package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_443 {
    private final Production87_443 production = new Production87_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}