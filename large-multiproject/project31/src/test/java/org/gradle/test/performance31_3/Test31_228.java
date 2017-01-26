package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_228 {
    private final Production31_228 production = new Production31_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}