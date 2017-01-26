package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_432 {
    private final Production31_432 production = new Production31_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}