package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_455 {
    private final Production31_455 production = new Production31_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}