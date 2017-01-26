package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_337 {
    private final Production31_337 production = new Production31_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}