package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_340 {
    private final Production45_340 production = new Production45_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}