package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_122 {
    private final Production87_122 production = new Production87_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}