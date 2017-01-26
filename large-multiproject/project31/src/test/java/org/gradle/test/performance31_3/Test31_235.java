package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_235 {
    private final Production31_235 production = new Production31_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}