package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_311 {
    private final Production87_311 production = new Production87_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}