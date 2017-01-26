package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_323 {
    private final Production31_323 production = new Production31_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}