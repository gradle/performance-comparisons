package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_391 {
    private final Production87_391 production = new Production87_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}