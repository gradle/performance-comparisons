package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_338 {
    private final Production31_338 production = new Production31_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}