package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_419 {
    private final Production31_419 production = new Production31_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}