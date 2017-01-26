package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_283 {
    private final Production87_283 production = new Production87_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}