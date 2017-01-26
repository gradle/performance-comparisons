package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_418 {
    private final Production31_418 production = new Production31_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}