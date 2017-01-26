package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_421 {
    private final Production31_421 production = new Production31_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}