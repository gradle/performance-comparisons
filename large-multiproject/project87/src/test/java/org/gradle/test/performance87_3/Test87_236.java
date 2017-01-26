package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_236 {
    private final Production87_236 production = new Production87_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}