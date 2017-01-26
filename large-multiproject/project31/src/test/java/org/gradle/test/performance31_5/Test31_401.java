package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_401 {
    private final Production31_401 production = new Production31_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}