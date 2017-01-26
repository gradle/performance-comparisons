package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_245 {
    private final Production45_245 production = new Production45_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}