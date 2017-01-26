package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_188 {
    private final Production31_188 production = new Production31_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}