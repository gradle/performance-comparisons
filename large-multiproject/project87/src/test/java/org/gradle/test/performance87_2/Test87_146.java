package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_146 {
    private final Production87_146 production = new Production87_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}