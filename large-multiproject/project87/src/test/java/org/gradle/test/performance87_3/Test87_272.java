package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_272 {
    private final Production87_272 production = new Production87_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}