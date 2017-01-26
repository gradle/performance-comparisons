package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_382 {
    private final Production31_382 production = new Production31_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}