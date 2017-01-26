package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_161 {
    private final Production31_161 production = new Production31_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}