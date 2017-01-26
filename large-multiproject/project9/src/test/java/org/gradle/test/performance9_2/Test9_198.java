package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_198 {
    private final Production9_198 production = new Production9_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}