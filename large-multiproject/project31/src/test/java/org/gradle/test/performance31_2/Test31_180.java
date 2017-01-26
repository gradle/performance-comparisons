package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_180 {
    private final Production31_180 production = new Production31_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}