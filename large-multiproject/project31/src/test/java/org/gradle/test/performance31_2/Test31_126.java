package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_126 {
    private final Production31_126 production = new Production31_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}