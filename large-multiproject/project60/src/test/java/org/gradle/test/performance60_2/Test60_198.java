package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_198 {
    private final Production60_198 production = new Production60_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}