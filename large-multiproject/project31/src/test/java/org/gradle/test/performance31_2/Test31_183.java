package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_183 {
    private final Production31_183 production = new Production31_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}