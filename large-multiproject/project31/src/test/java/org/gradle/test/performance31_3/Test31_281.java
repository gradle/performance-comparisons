package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_281 {
    private final Production31_281 production = new Production31_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}