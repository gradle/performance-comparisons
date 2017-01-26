package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_90 {
    private final Production31_90 production = new Production31_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}