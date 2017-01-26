package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_308 {
    private final Production87_308 production = new Production87_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}