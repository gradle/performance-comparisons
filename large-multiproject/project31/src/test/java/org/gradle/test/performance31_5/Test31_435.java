package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_435 {
    private final Production31_435 production = new Production31_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}