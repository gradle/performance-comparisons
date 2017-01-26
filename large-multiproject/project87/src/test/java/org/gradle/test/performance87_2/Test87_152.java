package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_152 {
    private final Production87_152 production = new Production87_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}