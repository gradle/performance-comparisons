package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_400 {
    private final Production87_400 production = new Production87_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}