package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_138 {
    private final Production31_138 production = new Production31_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}