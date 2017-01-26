package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_125 {
    private final Production87_125 production = new Production87_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}