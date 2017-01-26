package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_302 {
    private final Production4_302 production = new Production4_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}