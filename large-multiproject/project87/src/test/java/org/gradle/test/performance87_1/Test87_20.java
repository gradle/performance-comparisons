package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_20 {
    private final Production87_20 production = new Production87_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}