package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_30 {
    private final Production31_30 production = new Production31_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}