package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_424 {
    private final Production31_424 production = new Production31_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}