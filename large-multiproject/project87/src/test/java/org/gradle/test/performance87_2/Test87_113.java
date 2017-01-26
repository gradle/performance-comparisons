package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_113 {
    private final Production87_113 production = new Production87_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}