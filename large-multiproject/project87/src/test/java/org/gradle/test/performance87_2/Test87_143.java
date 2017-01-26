package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_143 {
    private final Production87_143 production = new Production87_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}