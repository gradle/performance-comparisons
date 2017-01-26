package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_139 {
    private final Production31_139 production = new Production31_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}