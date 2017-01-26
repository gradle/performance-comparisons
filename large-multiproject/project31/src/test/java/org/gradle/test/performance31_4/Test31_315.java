package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_315 {
    private final Production31_315 production = new Production31_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}