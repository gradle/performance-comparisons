package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_260 {
    private final Production31_260 production = new Production31_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}