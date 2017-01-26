package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_150 {
    private final Production31_150 production = new Production31_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}