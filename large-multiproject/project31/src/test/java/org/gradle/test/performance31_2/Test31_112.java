package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_112 {
    private final Production31_112 production = new Production31_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}