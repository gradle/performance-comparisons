package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_156 {
    private final Production87_156 production = new Production87_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}