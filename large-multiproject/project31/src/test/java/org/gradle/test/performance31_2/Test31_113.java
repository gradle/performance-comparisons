package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_113 {
    private final Production31_113 production = new Production31_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}