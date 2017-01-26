package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_206 {
    private final Production87_206 production = new Production87_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}