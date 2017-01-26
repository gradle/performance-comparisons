package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_272 {
    private final Production45_272 production = new Production45_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}