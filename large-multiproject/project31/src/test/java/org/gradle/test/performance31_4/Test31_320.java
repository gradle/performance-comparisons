package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_320 {
    private final Production31_320 production = new Production31_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}