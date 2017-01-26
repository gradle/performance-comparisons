package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_81 {
    private final Production87_81 production = new Production87_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}