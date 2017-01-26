package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_249 {
    private final Production87_249 production = new Production87_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}