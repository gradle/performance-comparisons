package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_377 {
    private final Production31_377 production = new Production31_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}