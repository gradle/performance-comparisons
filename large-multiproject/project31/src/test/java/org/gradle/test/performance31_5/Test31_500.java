package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_500 {
    private final Production31_500 production = new Production31_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}