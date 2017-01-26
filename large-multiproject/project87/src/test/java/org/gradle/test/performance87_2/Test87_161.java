package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_161 {
    private final Production87_161 production = new Production87_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}