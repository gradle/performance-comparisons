package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_137 {
    private final Production31_137 production = new Production31_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}