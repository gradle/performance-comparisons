package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_327 {
    private final Production9_327 production = new Production9_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}