package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_486 {
    private final Production87_486 production = new Production87_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}