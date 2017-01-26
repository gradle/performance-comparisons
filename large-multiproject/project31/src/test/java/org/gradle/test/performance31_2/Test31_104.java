package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_104 {
    private final Production31_104 production = new Production31_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}