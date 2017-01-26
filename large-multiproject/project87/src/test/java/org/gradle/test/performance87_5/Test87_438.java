package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_438 {
    private final Production87_438 production = new Production87_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}