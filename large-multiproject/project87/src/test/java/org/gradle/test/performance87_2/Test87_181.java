package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_181 {
    private final Production87_181 production = new Production87_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}