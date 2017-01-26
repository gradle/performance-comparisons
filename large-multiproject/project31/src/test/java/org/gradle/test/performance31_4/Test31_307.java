package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_307 {
    private final Production31_307 production = new Production31_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}