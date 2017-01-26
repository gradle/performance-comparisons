package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_276 {
    private final Production87_276 production = new Production87_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}