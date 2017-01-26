package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_245 {
    private final Production11_245 production = new Production11_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}