package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_423 {
    private final Production87_423 production = new Production87_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}