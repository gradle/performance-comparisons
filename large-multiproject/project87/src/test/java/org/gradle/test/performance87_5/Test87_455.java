package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_455 {
    private final Production87_455 production = new Production87_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}