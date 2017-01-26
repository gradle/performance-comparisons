package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_485 {
    private final Production87_485 production = new Production87_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}