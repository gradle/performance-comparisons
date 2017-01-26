package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_499 {
    private final Production87_499 production = new Production87_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}