package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_171 {
    private final Production87_171 production = new Production87_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}