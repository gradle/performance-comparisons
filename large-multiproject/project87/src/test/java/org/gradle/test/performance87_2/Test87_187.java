package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_187 {
    private final Production87_187 production = new Production87_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}