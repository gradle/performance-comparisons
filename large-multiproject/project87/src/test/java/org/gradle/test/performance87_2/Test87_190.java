package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_190 {
    private final Production87_190 production = new Production87_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}