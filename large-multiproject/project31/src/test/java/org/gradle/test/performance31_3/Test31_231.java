package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_231 {
    private final Production31_231 production = new Production31_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}