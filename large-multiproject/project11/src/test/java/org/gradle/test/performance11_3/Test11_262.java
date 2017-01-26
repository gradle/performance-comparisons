package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_262 {
    private final Production11_262 production = new Production11_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}