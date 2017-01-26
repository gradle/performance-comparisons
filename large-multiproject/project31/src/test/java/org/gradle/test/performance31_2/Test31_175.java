package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_175 {
    private final Production31_175 production = new Production31_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}