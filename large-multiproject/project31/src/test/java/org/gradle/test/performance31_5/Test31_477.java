package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_477 {
    private final Production31_477 production = new Production31_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}