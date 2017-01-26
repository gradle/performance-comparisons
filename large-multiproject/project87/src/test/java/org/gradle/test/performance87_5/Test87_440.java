package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_440 {
    private final Production87_440 production = new Production87_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}