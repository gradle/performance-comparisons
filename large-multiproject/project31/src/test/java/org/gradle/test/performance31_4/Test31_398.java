package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_398 {
    private final Production31_398 production = new Production31_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}