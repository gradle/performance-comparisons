package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_84 {
    private final Production31_84 production = new Production31_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}