package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_238 {
    private final Production31_238 production = new Production31_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}