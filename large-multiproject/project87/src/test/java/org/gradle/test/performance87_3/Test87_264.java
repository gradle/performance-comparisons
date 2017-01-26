package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_264 {
    private final Production87_264 production = new Production87_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}