package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_403 {
    private final Production31_403 production = new Production31_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}