package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_6 {
    private final Production31_6 production = new Production31_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}