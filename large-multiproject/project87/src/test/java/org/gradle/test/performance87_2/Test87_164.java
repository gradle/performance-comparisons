package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_164 {
    private final Production87_164 production = new Production87_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}