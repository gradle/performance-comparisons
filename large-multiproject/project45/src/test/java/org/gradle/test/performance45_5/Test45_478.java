package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_478 {
    private final Production45_478 production = new Production45_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}