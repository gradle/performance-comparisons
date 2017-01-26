package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_396 {
    private final Production31_396 production = new Production31_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}