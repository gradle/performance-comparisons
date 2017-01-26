package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_330 {
    private final Production31_330 production = new Production31_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}