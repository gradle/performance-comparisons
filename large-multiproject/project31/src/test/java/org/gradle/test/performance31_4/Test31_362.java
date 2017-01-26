package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_362 {
    private final Production31_362 production = new Production31_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}