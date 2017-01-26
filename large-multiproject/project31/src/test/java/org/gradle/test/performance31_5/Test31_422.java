package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_422 {
    private final Production31_422 production = new Production31_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}