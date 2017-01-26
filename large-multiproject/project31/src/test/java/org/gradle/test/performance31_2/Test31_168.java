package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_168 {
    private final Production31_168 production = new Production31_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}