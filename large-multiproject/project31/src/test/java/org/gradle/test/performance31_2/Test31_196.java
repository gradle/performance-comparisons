package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_196 {
    private final Production31_196 production = new Production31_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}