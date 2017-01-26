package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_89 {
    private final Production31_89 production = new Production31_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}