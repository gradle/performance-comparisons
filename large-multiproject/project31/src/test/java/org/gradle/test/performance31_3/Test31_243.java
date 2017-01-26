package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_243 {
    private final Production31_243 production = new Production31_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}