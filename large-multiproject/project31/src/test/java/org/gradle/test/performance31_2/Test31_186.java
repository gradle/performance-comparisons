package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_186 {
    private final Production31_186 production = new Production31_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}