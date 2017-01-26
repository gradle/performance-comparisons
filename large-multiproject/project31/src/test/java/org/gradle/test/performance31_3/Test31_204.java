package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_204 {
    private final Production31_204 production = new Production31_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}