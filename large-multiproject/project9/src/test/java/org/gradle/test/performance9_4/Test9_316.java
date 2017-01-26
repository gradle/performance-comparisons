package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_316 {
    private final Production9_316 production = new Production9_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}