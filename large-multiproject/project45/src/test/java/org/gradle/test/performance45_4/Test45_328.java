package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_328 {
    private final Production45_328 production = new Production45_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}