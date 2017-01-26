package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_301 {
    private final Production87_301 production = new Production87_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}