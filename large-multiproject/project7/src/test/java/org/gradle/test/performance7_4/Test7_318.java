package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_318 {
    private final Production7_318 production = new Production7_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}