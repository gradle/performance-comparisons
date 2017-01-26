package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_266 {
    private final Production31_266 production = new Production31_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}