package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_198 {
    private final Production30_198 production = new Production30_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}