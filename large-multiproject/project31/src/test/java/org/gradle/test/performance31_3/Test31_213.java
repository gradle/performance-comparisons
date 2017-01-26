package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_213 {
    private final Production31_213 production = new Production31_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}