package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_13 {
    private final Production87_13 production = new Production87_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}