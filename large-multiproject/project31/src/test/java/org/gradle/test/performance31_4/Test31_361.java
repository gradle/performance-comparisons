package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_361 {
    private final Production31_361 production = new Production31_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}