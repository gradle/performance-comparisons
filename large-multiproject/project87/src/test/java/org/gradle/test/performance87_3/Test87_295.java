package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_295 {
    private final Production87_295 production = new Production87_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}