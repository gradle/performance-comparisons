package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_306 {
    private final Production31_306 production = new Production31_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}