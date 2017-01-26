package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_318 {
    private final Production14_318 production = new Production14_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}