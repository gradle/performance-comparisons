package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_215 {
    private final Production31_215 production = new Production31_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}