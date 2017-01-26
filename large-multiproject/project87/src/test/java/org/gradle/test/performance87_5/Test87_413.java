package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_413 {
    private final Production87_413 production = new Production87_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}