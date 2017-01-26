package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_164 {
    private final Production31_164 production = new Production31_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}