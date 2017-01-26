package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_64 {
    private final Production87_64 production = new Production87_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}