package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_170 {
    private final Production87_170 production = new Production87_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}