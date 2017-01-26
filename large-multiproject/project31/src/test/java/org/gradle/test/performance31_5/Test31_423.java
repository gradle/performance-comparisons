package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_423 {
    private final Production31_423 production = new Production31_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}