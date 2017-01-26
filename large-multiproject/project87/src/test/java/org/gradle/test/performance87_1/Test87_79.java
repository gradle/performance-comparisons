package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_79 {
    private final Production87_79 production = new Production87_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}