package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_212 {
    private final Production31_212 production = new Production31_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}