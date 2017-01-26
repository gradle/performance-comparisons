package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_256 {
    private final Production87_256 production = new Production87_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}