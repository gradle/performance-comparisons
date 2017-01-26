package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_313 {
    private final Production31_313 production = new Production31_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}