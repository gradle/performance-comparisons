package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_289 {
    private final Production31_289 production = new Production31_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}