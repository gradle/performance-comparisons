package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_127 {
    private final Production31_127 production = new Production31_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}