package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_148 {
    private final Production87_148 production = new Production87_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}