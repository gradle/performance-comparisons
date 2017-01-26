package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_187 {
    private final Production31_187 production = new Production31_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}