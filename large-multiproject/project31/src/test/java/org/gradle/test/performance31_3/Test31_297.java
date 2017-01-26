package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_297 {
    private final Production31_297 production = new Production31_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}