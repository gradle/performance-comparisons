package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_283 {
    private final Production31_283 production = new Production31_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}