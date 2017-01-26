package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_47 {
    private final Production31_47 production = new Production31_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}