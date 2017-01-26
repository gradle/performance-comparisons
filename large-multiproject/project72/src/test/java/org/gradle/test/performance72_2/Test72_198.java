package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_198 {
    private final Production72_198 production = new Production72_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}