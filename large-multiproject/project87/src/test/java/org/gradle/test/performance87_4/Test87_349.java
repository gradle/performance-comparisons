package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_349 {
    private final Production87_349 production = new Production87_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}