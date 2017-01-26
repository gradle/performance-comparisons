package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_223 {
    private final Production9_223 production = new Production9_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}