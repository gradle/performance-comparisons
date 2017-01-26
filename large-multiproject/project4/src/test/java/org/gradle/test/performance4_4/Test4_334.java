package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_334 {
    private final Production4_334 production = new Production4_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}