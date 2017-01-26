package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_235 {
    private final Production87_235 production = new Production87_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}