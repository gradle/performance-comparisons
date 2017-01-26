package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_305 {
    private final Production31_305 production = new Production31_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}