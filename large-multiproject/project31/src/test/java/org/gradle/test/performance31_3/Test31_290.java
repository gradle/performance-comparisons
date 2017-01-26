package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_290 {
    private final Production31_290 production = new Production31_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}