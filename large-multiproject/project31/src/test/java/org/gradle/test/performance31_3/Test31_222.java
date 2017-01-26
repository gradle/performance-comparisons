package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_222 {
    private final Production31_222 production = new Production31_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}