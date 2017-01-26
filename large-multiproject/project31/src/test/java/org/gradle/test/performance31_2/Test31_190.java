package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_190 {
    private final Production31_190 production = new Production31_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}