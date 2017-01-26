package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_286 {
    private final Production31_286 production = new Production31_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}