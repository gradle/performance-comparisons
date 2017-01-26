package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_275 {
    private final Production87_275 production = new Production87_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}