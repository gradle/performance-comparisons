package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_71 {
    private final Production31_71 production = new Production31_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}