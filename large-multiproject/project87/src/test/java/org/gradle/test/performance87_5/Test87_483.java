package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_483 {
    private final Production87_483 production = new Production87_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}