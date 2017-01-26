package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_59 {
    private final Production31_59 production = new Production31_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}