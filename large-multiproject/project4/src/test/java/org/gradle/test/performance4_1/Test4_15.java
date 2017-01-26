package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_15 {
    private final Production4_15 production = new Production4_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}