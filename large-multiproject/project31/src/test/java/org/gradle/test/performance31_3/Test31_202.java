package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_202 {
    private final Production31_202 production = new Production31_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}