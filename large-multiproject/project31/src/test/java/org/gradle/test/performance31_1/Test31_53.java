package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_53 {
    private final Production31_53 production = new Production31_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}