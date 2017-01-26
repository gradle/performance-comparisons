package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_84 {
    private final Production87_84 production = new Production87_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}