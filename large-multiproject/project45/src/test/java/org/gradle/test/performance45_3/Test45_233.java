package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_233 {
    private final Production45_233 production = new Production45_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}