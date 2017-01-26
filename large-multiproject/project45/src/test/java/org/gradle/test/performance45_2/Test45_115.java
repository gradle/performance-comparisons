package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_115 {
    private final Production45_115 production = new Production45_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}