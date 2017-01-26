package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_253 {
    private final Production31_253 production = new Production31_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}