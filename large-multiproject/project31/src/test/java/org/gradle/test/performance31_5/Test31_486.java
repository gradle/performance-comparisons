package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_486 {
    private final Production31_486 production = new Production31_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}