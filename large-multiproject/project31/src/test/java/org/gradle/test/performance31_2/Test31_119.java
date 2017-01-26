package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_119 {
    private final Production31_119 production = new Production31_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}