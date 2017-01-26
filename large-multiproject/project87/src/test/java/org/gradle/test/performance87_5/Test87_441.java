package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_441 {
    private final Production87_441 production = new Production87_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}