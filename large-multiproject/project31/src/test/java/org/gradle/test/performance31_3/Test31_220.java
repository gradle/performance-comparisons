package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_220 {
    private final Production31_220 production = new Production31_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}