package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_120 {
    private final Production87_120 production = new Production87_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}