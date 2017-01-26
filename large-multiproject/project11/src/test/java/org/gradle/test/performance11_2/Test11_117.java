package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_117 {
    private final Production11_117 production = new Production11_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}