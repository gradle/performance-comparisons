package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_143 {
    private final Production31_143 production = new Production31_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}