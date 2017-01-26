package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_214 {
    private final Production31_214 production = new Production31_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}