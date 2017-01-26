package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_184 {
    private final Production87_184 production = new Production87_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}