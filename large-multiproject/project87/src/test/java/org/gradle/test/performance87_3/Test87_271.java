package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_271 {
    private final Production87_271 production = new Production87_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}