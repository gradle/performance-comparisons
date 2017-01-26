package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_209 {
    private final Production31_209 production = new Production31_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}