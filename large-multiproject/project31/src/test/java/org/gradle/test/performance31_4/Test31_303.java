package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_303 {
    private final Production31_303 production = new Production31_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}