package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_372 {
    private final Production87_372 production = new Production87_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}