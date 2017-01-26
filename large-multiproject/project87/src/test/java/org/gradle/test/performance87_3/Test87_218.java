package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_218 {
    private final Production87_218 production = new Production87_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}