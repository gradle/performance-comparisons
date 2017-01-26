package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_480 {
    private final Production87_480 production = new Production87_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}