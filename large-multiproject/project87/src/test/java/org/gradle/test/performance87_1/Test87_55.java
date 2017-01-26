package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_55 {
    private final Production87_55 production = new Production87_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}