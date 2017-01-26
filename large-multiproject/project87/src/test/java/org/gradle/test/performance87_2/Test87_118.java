package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_118 {
    private final Production87_118 production = new Production87_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}