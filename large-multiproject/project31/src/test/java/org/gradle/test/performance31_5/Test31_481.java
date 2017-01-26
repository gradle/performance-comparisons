package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_481 {
    private final Production31_481 production = new Production31_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}