package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_198 {
    private final Production2_198 production = new Production2_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}