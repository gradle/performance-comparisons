package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_130 {
    private final Production87_130 production = new Production87_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}