package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_150 {
    private final Production87_150 production = new Production87_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}