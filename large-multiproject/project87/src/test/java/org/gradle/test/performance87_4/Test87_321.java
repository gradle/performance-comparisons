package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_321 {
    private final Production87_321 production = new Production87_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}