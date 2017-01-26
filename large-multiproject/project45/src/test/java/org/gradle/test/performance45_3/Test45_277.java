package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_277 {
    private final Production45_277 production = new Production45_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}