package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_24 {
    private final Production87_24 production = new Production87_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}