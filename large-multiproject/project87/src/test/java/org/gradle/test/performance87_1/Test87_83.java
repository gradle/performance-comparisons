package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_83 {
    private final Production87_83 production = new Production87_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}