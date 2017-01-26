package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_457 {
    private final Production31_457 production = new Production31_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}