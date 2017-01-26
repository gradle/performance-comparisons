package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_213 {
    private final Production87_213 production = new Production87_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}