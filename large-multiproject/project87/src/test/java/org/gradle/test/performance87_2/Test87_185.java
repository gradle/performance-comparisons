package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_185 {
    private final Production87_185 production = new Production87_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}