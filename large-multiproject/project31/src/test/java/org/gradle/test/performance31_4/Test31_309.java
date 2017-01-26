package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_309 {
    private final Production31_309 production = new Production31_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}