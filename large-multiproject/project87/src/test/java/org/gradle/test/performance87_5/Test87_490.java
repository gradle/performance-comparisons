package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_490 {
    private final Production87_490 production = new Production87_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}