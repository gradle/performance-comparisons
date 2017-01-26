package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_390 {
    private final Production31_390 production = new Production31_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}