package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_193 {
    private final Production87_193 production = new Production87_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}