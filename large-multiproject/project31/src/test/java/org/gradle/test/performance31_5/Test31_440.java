package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_440 {
    private final Production31_440 production = new Production31_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}