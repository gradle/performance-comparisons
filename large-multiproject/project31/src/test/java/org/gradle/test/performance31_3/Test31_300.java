package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_300 {
    private final Production31_300 production = new Production31_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}