package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_298 {
    private final Production45_298 production = new Production45_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}