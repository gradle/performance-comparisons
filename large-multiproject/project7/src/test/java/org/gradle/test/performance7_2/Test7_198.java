package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_198 {
    private final Production7_198 production = new Production7_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}