package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_292 {
    private final Production87_292 production = new Production87_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}