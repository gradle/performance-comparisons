package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_217 {
    private final Production87_217 production = new Production87_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}