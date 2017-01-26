package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_182 {
    private final Production87_182 production = new Production87_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}