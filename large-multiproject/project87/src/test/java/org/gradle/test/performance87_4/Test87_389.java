package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_389 {
    private final Production87_389 production = new Production87_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}