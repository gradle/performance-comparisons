package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_275 {
    private final Production45_275 production = new Production45_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}